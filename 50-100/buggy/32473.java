private java.util.List<com.google.common.util.concurrent.ListenableFuture<com.datastax.driver.core.ResultSet>> _readIn(com.orangerhymelabs.helenus.persistence.Identifier... ids) {
    if (ids == null)
        return null;
    
    java.util.List<com.datastax.driver.core.ResultSetFuture> futures = new java.util.ArrayList<com.datastax.driver.core.ResultSetFuture>(ids.length);
    com.datastax.driver.core.BoundStatement bs = new com.datastax.driver.core.BoundStatement(readStmt);
    for (com.orangerhymelabs.helenus.persistence.Identifier id : ids) {
        bindIdentity(bs, id);
        futures.add(session.executeAsync(bs));
    }
    return com.google.common.util.concurrent.Futures.inCompletionOrder(futures);
}