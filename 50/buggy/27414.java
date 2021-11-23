private java.lang.String getTeamColor(net.minecraft.scoreboard.ScorePlayerTeam team) {
    java.lang.System.out.println(("Got color prefix " + (team.getColorPrefix().substring(0, 2))));
    return team.getColorPrefix().substring(0, 2);
}