@java.lang.Override
public java.sql.Connection getConnection(java.lang.String username, java.lang.String password) throws java.sql.SQLException {
    checkConnections();
    org.eclipse.dirigible.repository.datasource.WrappedConnection wrappedConnection = new org.eclipse.dirigible.repository.datasource.WrappedConnection(originalDataSource.getConnection(username, password), this);
    addConnection(wrappedConnection);
    wrappedConnection.setAutoCommit(org.eclipse.dirigible.repository.datasource.WrappedDataSource.AUTO_COMMIT_ENABLED);
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug(((("Connection acquired: " + (wrappedConnection.hashCode())) + " count: ") + (org.eclipse.dirigible.repository.datasource.WrappedDataSource.connections.size())));
    return wrappedConnection;
}