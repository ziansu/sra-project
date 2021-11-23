private void clearUsage() {
    org.fogbowcloud.accounting.db.AccountingDataStore.LOGGER.debug("Deleting usage entries");
    java.sql.Statement deleteStatement = null;
    try {
        java.sql.Connection connection = getConnection();
        deleteStatement = connection.createStatement();
        boolean deleted = deleteStatement.execute(org.fogbowcloud.accounting.db.AccountingDataStore.DELETE_ALL_FROM_USAGE);
        if (deleted) {
            org.fogbowcloud.accounting.db.AccountingDataStore.LOGGER.debug("Usage data deleted");
        }else {
            org.fogbowcloud.accounting.db.AccountingDataStore.LOGGER.debug("Error while deleting usage data");
        }
    } catch (java.sql.SQLException e) {
        org.fogbowcloud.accounting.db.AccountingDataStore.LOGGER.debug("Could not delete usage data", e);
    }
}