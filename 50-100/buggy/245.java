private static org.jfaster.mango.transaction.Transaction newTransaction(javax.sql.DataSource dataSource, org.jfaster.mango.transaction.TransactionIsolationLevel level) {
    if (dataSource == null) {
        new java.lang.IllegalArgumentException("DataSource can't be null");
    }
    if (level == null) {
        new java.lang.IllegalArgumentException("TransactionIsolationLevel can't be null");
    }
    org.jfaster.mango.transaction.ConnectionHolder connHolder = org.jfaster.mango.transaction.TransactionSynchronizationManager.getConnectionHolder(dataSource);
    return connHolder != null ? org.jfaster.mango.transaction.TransactionFactory.usingExistingTransaction(dataSource) : org.jfaster.mango.transaction.TransactionFactory.createNewTransaction(dataSource, level);
}