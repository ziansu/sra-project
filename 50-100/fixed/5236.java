@java.lang.Override
public void close() throws java.io.IOException {
    if (((connectionManager) != null) && (connectionConfig.shouldCloseIdleConnectionsAfterEachResponse())) {
        connectionManager.closeIdleConnections(connectionConfig.closeIdleConnectionConfig().getIdleTime(), connectionConfig.closeIdleConnectionConfig().getTimeUnit());
    }
    if ((wrapped) != null) {
        wrapped.close();
    }
}