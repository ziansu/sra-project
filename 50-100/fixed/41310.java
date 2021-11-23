private void clearUsage() {
    org.fogbowcloud.accounting.db.AccountingDataStore.LOGGER.debug("Deleting usage entries");
    java.sql.Statement deleteStatement = null;
    try {
        java.sql.Connection connection = getConnection();
        deleteStatement = connection.createStatement();
        deleteStatement.execute(org.fogbowcloud.accounting.db.AccountingDataStore.DELETE_ALL_FROM_USAGE);
    } catch (java.sql.SQLException e) {
        org.fogbowcloud.accounting.db.AccountingDataStore.LOGGER.debug("Could not delete usage data", e);
    }
}