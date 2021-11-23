private static java.lang.String verifyLeagueComponents(org.sportim.service.beans.LeagueBean league, java.sql.Connection conn) throws java.sql.SQLException {
    java.lang.String message = null;
    if ((league.getLeagueId()) > 0) {
        if (!(org.sportim.service.LeagueAPI.verifyLeague(league.getLeagueId(), conn))) {
            message = "Non-existent league ID specified.";
        }
    }
    return message;
}