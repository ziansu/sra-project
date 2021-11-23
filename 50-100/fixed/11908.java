private void setTeamColor(net.minecraft.scoreboard.ScorePlayerTeam team, java.lang.String newTeamColor) {
    java.lang.String prefix = team.getColorPrefix();
    java.lang.String prefixSplit;
    try {
        prefixSplit = prefix.substring(4);
    } catch (java.lang.NullPointerException e) {
        prefix = "\u00a7r\u00a7r";
        prefixSplit = "";
    } catch (java.lang.StringIndexOutOfBoundsException e) {
        prefixSplit = "";
    }
    team.setNamePrefix((newTeamColor + prefixSplit));
}