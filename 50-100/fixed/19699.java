public void addPoints(java.lang.String player, java.lang.Integer points) {
    points = ((int) (java.lang.Math.round(points)));
    mysqlQuery((((((("UPDATE `" + (org.mcsg.survivalgames.points.PointSystem.getInstance().playerStatTable)) + "` SET `points` = `points`+") + points) + " WHERE `name` = '") + player) + "'"));
    org.mcsg.survivalgames.points.PointQueries.cachedStats.get(player.toLowerCase()).addPoints(points);
}