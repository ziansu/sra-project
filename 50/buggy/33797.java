public com.couchbase.cbforest.QueryIterator fullTextQuery(java.lang.String queryString, java.lang.String languageCode, boolean ranked) throws com.couchbase.cbforest.ForestException {
    return new com.couchbase.cbforest.QueryIterator(com.couchbase.cbforest.View.query(_handle, queryString, languageCode, ranked));
}