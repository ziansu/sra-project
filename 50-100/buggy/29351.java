private void loadDriverClass(final edu.pitt.sis.exp.colfusion.dal.managers.ExecutionInfoManager executionInfoMgr, final int executionLogId) throws java.lang.Exception {
    try {
        java.lang.Class.forName(edu.pitt.sis.exp.colfusion.dal.databaseHandlers.MySQLDatabaseHandler.MYSQL_DRIVER_CLASS);
    } catch (java.lang.ClassNotFoundException e) {
        if (executionInfoMgr != null) {
            executionInfoMgr.appendLog(executionLogId, java.lang.String.format("[ERROR] MySQLDatabaseHandler failed: Could not load MySQL JDBC driver. Error: %s", e.toString()));
        }
        logger.error("MySQLDatabaseHandler failed: Could not load MySQL JDBC driver", e);
        throw e;
    }
}