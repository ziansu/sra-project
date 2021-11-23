@javax.annotation.PreDestroy
private void releasePool() {
    by.tr.library.pool.ConnectionPool.closed.set(true);
    try {
        java.util.concurrent.TimeUnit.SECONDS.sleep(by.tr.library.pool.ConnectionPool.CLOSE_TIMEOUT_SEC);
        for (by.tr.library.pool.ProxyConnection connection : availableConnections) {
            try {
                connection.closeConnection();
            } catch (java.sql.SQLException ex) {
            }
        }
        if (!(usedConnections.isEmpty())) {
            for (by.tr.library.pool.ProxyConnection connection : usedConnections) {
                try {
                    connection.closeConnection();
                } catch (java.sql.SQLException ex) {
                }
            }
        }
    } catch (java.lang.InterruptedException ex) {
    }
}