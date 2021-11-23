public com.couchbase.cbforest.QueryIterator query() throws com.couchbase.cbforest.ForestException {
    return new com.couchbase.cbforest.QueryIterator(this, com.couchbase.cbforest.View.query(_handle));
}