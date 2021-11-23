private void removeConnection(org.eclipse.dirigible.repository.datasource.WrappedConnection connection) {
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("entring - removeConnection()");
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.connections.remove(connection);
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("exiting - removeConnection()");
}