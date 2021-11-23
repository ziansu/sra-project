public void closedConnection(org.eclipse.dirigible.repository.datasource.WrappedConnection wrappedConnection) {
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("entring - closeConnection()");
    removeConnection(wrappedConnection);
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug((((((("Connection released: " + (wrappedConnection.hashCode())) + " count: ") + (org.eclipse.dirigible.repository.datasource.WrappedDataSource.connections.size())) + " time used: ") + (wrappedConnection.getTimeUsed())) + "ms"));
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("exiting - closeConnection()");
}