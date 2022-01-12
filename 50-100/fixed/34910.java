@java.lang.Override
public java.sql.Connection getConnection() throws java.sql.SQLException {
    checkConnections();
    org.eclipse.dirigible.repository.datasource.WrappedConnection wrappedConnection = new org.eclipse.dirigible.repository.datasource.WrappedConnection(originalDataSource.getConnection(), this);
    addConnection(wrappedConnection);
    wrappedConnection.setAutoCommit(org.eclipse.dirigible.repository.datasource.WrappedDataSource.AUTO_COMMIT_ENABLED);
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug(((("Connection acquired: " + (wrappedConnection.hashCode())) + " count: ") + (org.eclipse.dirigible.repository.datasource.WrappedDataSource.connections.size())));
    return wrappedConnection;
}