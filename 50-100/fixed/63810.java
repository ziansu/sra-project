public void closedConnection(org.eclipse.dirigible.repository.datasource.WrappedConnection wrappedConnection) {
    removeConnection(wrappedConnection);
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug((((((("Connection released: " + (wrappedConnection.hashCode())) + " count: ") + (org.eclipse.dirigible.repository.datasource.WrappedDataSource.connections.size())) + " time used: ") + (wrappedConnection.getTimeUsed())) + "ms"));
}