public com.couchbase.cbforest.QueryIterator geoQuery(double xmin, double ymin, double xmax, double ymax) throws com.couchbase.cbforest.ForestException {
    return new com.couchbase.cbforest.QueryIterator(com.couchbase.cbforest.View.query(_handle, xmin, ymin, xmax, ymax));
}