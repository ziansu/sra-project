public void addDeath(final java.lang.String player, final java.lang.Integer playtime) {
    mysqlQuery((((((("UPDATE `" + (org.mcsg.survivalgames.points.PointSystem.getInstance().playerStatTable)) + "` SET `playtime` = `playtime`+") + playtime) + ", `deaths` = `deaths`+1 WHERE `name` = '") + player) + "'"));
    org.mcsg.survivalgames.points.PointQueries.cachedStats.get(player).addDeath();
}