private void addConnection(org.eclipse.dirigible.repository.datasource.WrappedConnection connection) {
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("entring - addConnection()");
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.connections.add(connection);
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("exiting - addConnection()");
}