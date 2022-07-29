package hellojpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "username")
    private String username;

    /*
    테이블 중심의 설계라고 볼 수 있다.
    @Column(name="team_id")
    private Long teamId;
     */

    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;
}
