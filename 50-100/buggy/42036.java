private void setDefaultSettings(final org.apache.commons.dbcp2.BasicDataSource basicDataSource) {
    basicDataSource.setDriverClassName(com.askit.database.ConnectionManager.MARIA_DB_DRIVER);
    basicDataSource.setUrl(com.askit.database.ConnectionManager.URL);
    basicDataSource.setDefaultAutoCommit(true);
    basicDataSource.setMinIdle(com.askit.database.ConnectionManager.MIN_IDLE);
    basicDataSource.setMaxIdle(com.askit.database.ConnectionManager.MAX_IDLE);
    basicDataSource.setMaxTotal(com.askit.database.ConnectionManager.MAX_PARALLEL_CONNECTIONS);
    basicDataSource.setInitialSize(com.askit.database.ConnectionManager.INITIAL_IDLE_CONNECTIONS);
    basicDataSource.setMaxOpenPreparedStatements(com.askit.database.ConnectionManager.MAX_PARALLEL_PREPARED_STATEMENTS);
    basicDataSource.setDefaultQueryTimeout(com.askit.database.ConnectionManager.QUERY_TIMEOUT);
    basicDataSource.setMaxConnLifetimeMillis(com.askit.database.ConnectionManager.MAX_CONNECTION_LIFETIME);
    tryToSetLoginTimeout(basicDataSource);
}