@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public com.tx.epl.model.Match findMatch(int season, java.lang.String homeTeamCode, java.lang.String awayTeamCode) {
    com.tx.epl.model.Team h = findTeam(homeTeamCode);
    com.tx.epl.model.Team a = findTeam(awayTeamCode);
    if ((null != h) && (null != a)) {
        return matchDAO.findByOpponents(season, h, a);
    }
    return null;
}