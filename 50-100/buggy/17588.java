@java.lang.Override
public com.google.common.util.concurrent.ListenableFuture<com.orangerhymelabs.helenus.cassandra.table.Table> apply(java.lang.Boolean exists) throws java.lang.Exception {
    if (!exists) {
        try {
            com.strategicgains.syntaxe.ValidationEngine.validateAndThrow(table);
            return tables.update(table);
        } catch (com.strategicgains.syntaxe.ValidationException e) {
            return com.google.common.util.concurrent.Futures.immediateFailedFuture(e);
        }
    }else {
        return com.google.common.util.concurrent.Futures.immediateFailedFuture(new com.orangerhymelabs.helenus.exception.ItemNotFoundException(("Database not found: " + (table.databaseName()))));
    }
}