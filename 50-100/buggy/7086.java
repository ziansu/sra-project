@java.lang.Override
public void onSuccess(java.lang.Void result) {
    connectionRef.set(connection);
    open.set(true);
    if (isClosed()) {
        initFuture.setException(new com.datastax.driver.core.ConnectionException(host.getSocketAddress(), "Pool was closed during initialization"));
        connection.closeAsync().force();
    }else {
        com.datastax.driver.core.SingleConnectionPool.logger.trace("Created connection pool to host {}", host);
        phase = Phase.READY;
        initFuture.set(null);
    }
}