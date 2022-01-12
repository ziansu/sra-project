@java.lang.Override
public TeamGen.Draw generateTeams() throws java.lang.Exception {
    TeamGen.Draw result = new TeamGen.Draw();
    java.util.List<TeamGen.Team> possibleTeams;
    while (true) {
        possibleTeams = skaterPool.getPossibleTeams();
        if ((possibleTeams.size()) == 0)
            break;
        
        TeamGen.Team bestTeam = findBestTeam(possibleTeams);
        result.addTeam(bestTeam);
        skaterPool.removeTeam(bestTeam);
    } 
    return result;
}