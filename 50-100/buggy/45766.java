private com.palantir.atlasdb.keyvalue.api.KeyValueService getDelegate(java.lang.String tableName) {
    com.palantir.atlasdb.keyvalue.api.KeyValueService delegate = delegateByTable.get(tableName);
    if (delegate == null) {
        if (com.palantir.atlasdb.schema.TableReference.isFullyQualifiedName(tableName)) {
            com.palantir.atlasdb.schema.TableReference tableRef = com.palantir.atlasdb.schema.TableReference.createFromFullyQualifiedName(tableName);
            delegate = delegateByNamespace.get(tableRef.getNamespace());
            if (delegate == null) {
                delegate = delegates.get(0);
            }
        }else {
            delegate = delegates.get(0);
        }
    }
    return delegate;
}