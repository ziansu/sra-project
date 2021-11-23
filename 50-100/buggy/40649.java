private boolean checkFederatedDatabase(java.lang.String sqlStatement) throws java.sql.SQLException {
    de.hpi.hpcc.parsing.ECLLayouts eclLayouts = new de.hpi.hpcc.parsing.ECLLayouts(connection.getDatabaseMetaData());
    de.hpi.hpcc.main.HPCCJDBCUtils.traceoutln(java.util.logging.Level.INFO, sqlStatement);
    java.util.Set<java.lang.String> tables = de.hpi.hpcc.parsing.SQLParser.getAllTables(sqlStatement);
    return ((de.hpi.hpcc.main.HPCCDriver.isPostgreSQLAvailable()) && (federatedDatabase)) && (!(de.hpi.hpcc.main.HPCCStatement.whiteList.containsAll(tables)));
}