public javax.resource.spi.ManagedConnection createManagedConnection(javax.security.auth.Subject subject, javax.resource.spi.ConnectionRequestInfo cxRequestInfo) throws javax.resource.ResourceException {
    logwriter.append("createManagedConnection()");
    createDatabase();
    (connectionsCreated)++;
    return new com.netoprise.neo4j.Neo4jManagedConnection(this);
}