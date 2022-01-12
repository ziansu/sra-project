public java.util.List<com.wotf.game.classes.Team> getTeams() {
    for (com.wotf.game.classes.Team team : teams) {
        if ((team.getUnits()) == null)
            team.makeUnitList();
        
    }
    return teams;
}