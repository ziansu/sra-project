private ai.grakn.redismock.Slice commitTransaction() {
    synchronized(base) {
        if ((transaction) == null)
            throw new java.lang.RuntimeException("No transaction started");
        
        java.util.List<ai.grakn.redismock.Slice> results;
        try {
            results = transaction.stream().map(RedisOperation::execute).collect(java.util.stream.Collectors.toList());
        } catch (java.lang.Throwable t) {
            ai.grakn.redismock.commands.RedisOperationExecutor.LOG.error("ERROR during committing transaction", t);
            return ai.grakn.redismock.Response.NULL;
        }
        closeTransaction();
        return ai.grakn.redismock.Response.array(results);
    }
}