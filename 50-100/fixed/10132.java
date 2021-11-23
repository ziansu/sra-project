public void setScore(java.lang.String name, int point) {
    for (org.bukkit.scoreboard.Scoreboard sb : scoreboards.values()) {
        org.bukkit.scoreboard.Objective obj = sb.getObjective(org.bitbucket.ucchy.fnafim.game.ScoreboardDisplay.OBJECTIVE_NAME);
        if (point == 0) {
            getScoreItem(obj, name).setScore(1);
        }
        getScoreItem(obj, name).setScore(point);
    }
}