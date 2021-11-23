@com.sun.istack.internal.Nullable
private com.mayhew3.gamesutil.tv.ErrorLogPostgres getErrorLog(java.lang.String tivoId) throws java.sql.SQLException {
    java.sql.ResultSet resultSet = connection.prepareAndExecuteStatementFetch(("SELECT *" + (("FROM error_log " + "WHERE tivo_id = ? ") + "AND resolved = ?")), tivoId, false);
    if (resultSet.next()) {
        com.mayhew3.gamesutil.tv.ErrorLogPostgres errorLog = new com.mayhew3.gamesutil.tv.ErrorLogPostgres();
        errorLog.initializeFromDBObject(resultSet);
        return errorLog;
    }
    return null;
}