public static void addPoints(java.util.UUID uuid, int value) {
    if (!(com.muwbi.devathlon.clazz.Team.hasTeam(uuid))) {
        return ;
    }
    org.bukkit.scoreboard.Score score = com.muwbi.devathlon.clazz.Team.getTeam(uuid).getPointsObjective().getScore(org.bukkit.Bukkit.getPlayer(uuid).getName());
    score.setScore(((score.getScore()) + value));
}