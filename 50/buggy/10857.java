@java.lang.Override
public com.google.enterprise.connector.spi.Connector makeConnector(java.util.Map<java.lang.String, java.lang.String> config) throws com.google.enterprise.connector.spi.RepositoryException {
    if ((connector) == null) {
        throw new com.google.enterprise.connector.spi.RepositoryException("No connector instance");
    }
    return instance;
}