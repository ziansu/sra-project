@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public com.tx.epl.model.Match findMatch(int season, java.lang.String homeTeamCode, java.lang.String awayTeamCode) {
    com.tx.epl.model.Team h = findTeam(homeTeamCode);
    com.tx.epl.model.Team a = findTeam(awayTeamCode);
    java.lang.System.out.println(h);
    java.lang.System.out.println(a);
    if ((null != h) && (null != a)) {
        return matchDAO.findByOpponents(season, h, a);
    }
    return null;
}