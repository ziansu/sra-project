public org.ektorp.CouchDbConnector add(java.lang.String repositoryId) {
    org.ektorp.CouchDbConnector connector = get(repositoryId);
    if (connector == null) {
        org.ektorp.http.HttpClient httpClient = builder.build();
        org.ektorp.CouchDbInstance dbInstance = new org.ektorp.impl.StdCouchDbInstance(httpClient);
        connector = dbInstance.createConnector(repositoryId, true);
        pool.put(repositoryId, connector);
    }
    return connector;
}