public java.util.ArrayList<Team> getConflicts(Team teamToCheck, java.util.ArrayList<Team> scoutTeamList) {
    java.util.ArrayList<Team> conflictingTeams = new java.util.ArrayList<>();
    for (Team otherTeam : scoutTeamList)
        for (Match match : teamToCheck.getMatchesIn())
            if (match.getTeamsInMatch().contains(teamToCheck))
                conflictingTeams.add(otherTeam);
            
        
    
    return conflictingTeams;
}