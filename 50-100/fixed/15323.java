@javax.annotation.PreDestroy
private void releasePool() {
    by.tr.library.pool.ConnectionPool.closed.set(true);
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
}