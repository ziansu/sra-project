void managePool() {
    if ((available.size()) < (minConnections)) {
        try {
            org.apache.cayenne.datasource.PoolAwareConnection c = createUnchecked();
            reclaim(c);
        } catch (java.sql.SQLException e) {
            org.apache.cayenne.datasource.PoolingDataSource.LOGGER.info("Error creating new connection when managing connection pool, ignoring", e);
        }
    }else
        if ((available.size()) > (maxIdleConnections)) {
            org.apache.cayenne.datasource.PoolAwareConnection c = uncheckNonBlocking(false);
            if (c != null) {
                retire(c);
            }
        }
    
}