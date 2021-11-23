public void addWin(final java.lang.String player, java.lang.Integer endtime, java.lang.Integer totaltime, java.lang.Integer startplayers, java.lang.Integer gameLength) {
    int calcPoints = calculatePoints(totaltime, endtime, startplayers);
    mysqlQuery((((((("UPDATE `" + (org.mcsg.survivalgames.points.PointSystem.getInstance().playerStatTable)) + "`SET `playtime` = `playtime`+") + gameLength) + ", `win` = `win`+1 WHERE `name` = '") + player) + "'"));
    addPoints(player.toLowerCase(), calcPoints);
    org.mcsg.survivalgames.points.PointQueries.cachedStats.get(player.toLowerCase()).addWin();
}