public void addUnitsSingleTeam(int selectedunitcount, com.wotf.game.classes.Team team) {
    for (int i = 0; i < selectedunitcount; i++) {
        team.addUnit(((team.getName()) + (java.lang.Integer.toString(i))), 100);
    }
}