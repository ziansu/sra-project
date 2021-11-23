public void delete(java.lang.String database, java.lang.String table, java.lang.Object id, com.google.common.util.concurrent.FutureCallback<com.orangerhymelabs.helenus.cassandra.document.Document> callback) {
    com.orangerhymelabs.helenus.cassandra.document.DocumentRepository docs = acquireRepositoryFor(database, table);
    docs.delete(new com.orangerhymelabs.helenus.persistence.Identifier(id), callback);
}