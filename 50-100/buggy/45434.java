public void addKill(final java.lang.String player, final java.lang.Integer playtime, final java.lang.Integer points) {
    org.bukkit.configuration.file.FileConfiguration c = org.mcsg.survivalgames.SettingsManager.getInstance().getConfig();
    mysqlQuery((((("UPDATE `" + (org.mcsg.survivalgames.points.PointSystem.getInstance().playerStatTable)) + "` SET `kills` = `kills`+1 WHERE `name` = '") + player) + "'"));
    addPoints(player, points);
    org.mcsg.survivalgames.points.PointQueries.cachedStats.get(player).addKill();
}