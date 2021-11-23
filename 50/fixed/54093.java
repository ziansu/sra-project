public boolean addTeam(Team t) {
    if (Scout.teamsScouted.contains(t))
        return false;
    
    java.lang.System.out.println("Added a team to a scout list!");
    Scout.teamsScouted.add(t);
    return teamsToScout.add(t);
}