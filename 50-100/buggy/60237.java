public void toDb(net.eithon.library.mysql.Database database) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    net.eithon.plugin.stats.logic.HourStatistics.eithonLogger.debug(DebugPrintLevel.VERBOSE, "HourStatistics.toDB: Enter for player %s", this.getName());
    java.lang.String updates = getDbUpdates();
    java.lang.String update = java.lang.String.format("UPDATE accumulated SET %s WHERE id=%d", updates, this._dbId);
    java.sql.Statement statement = database.getOrOpenConnection().createStatement();
    statement.executeUpdate(update);
    net.eithon.plugin.stats.logic.HourStatistics.eithonLogger.debug(DebugPrintLevel.VERBOSE, "PlayerSHourStatisticstatistics.toDB: Leave");
}