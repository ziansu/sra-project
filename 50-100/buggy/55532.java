public com.couchbase.cbforest.QueryIterator query(long skip, long limit, boolean descending, boolean inclusiveStart, boolean inclusiveEnd, java.lang.Object[] keys) throws com.couchbase.cbforest.ForestException {
    long[] keyHandles = new long[keys.length];
    int i = 0;
    for (java.lang.Object key : keys) {
        keyHandles[(i++)] = com.couchbase.cbforest.View.objectToKey(key);
    }
    return new com.couchbase.cbforest.QueryIterator(com.couchbase.cbforest.View.query(_handle, skip, limit, descending, inclusiveStart, inclusiveEnd, keyHandles));
}