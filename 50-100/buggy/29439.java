@java.lang.Override
public TeamGen.Draw generateTeams() throws java.lang.Exception {
    TeamGen.Draw result = new TeamGen.Draw();
    java.util.List<TeamGen.Team> possibleTeams;
    do {
        possibleTeams = skaterPool.getPossibleTeams();
        TeamGen.Team bestTeam = findBestTeam(possibleTeams);
        result.addTeam(bestTeam);
        skaterPool.removeTeam(bestTeam);
    } while ((possibleTeams.size()) > 0 );
    return result;
}