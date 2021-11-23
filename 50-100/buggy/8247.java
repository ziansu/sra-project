public void beginTransaction() throws java.sql.SQLException {
    if (null == (isSupportTransaction)) {
        isSupportTransaction = conn.getMetaData().supportsTransactions();
    }else
        if (false == (isSupportTransaction)) {
            throw new java.sql.SQLException("Transaction not supported for current database!");
        }
    
    conn.setAutoCommit(false);
}