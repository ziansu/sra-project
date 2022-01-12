private static final com.mongodb.BasicDBObject buildSort(it.percassi.perparser.facade.model.MongoSortConfig sortConfig) {
    com.mongodb.BasicDBObject sort = null;
    if (((sortConfig != null) && ((sortConfig.getSortType()) != null)) && ((sortConfig.getSortField()) != null)) {
        sort = new com.mongodb.BasicDBObject(sortConfig.getSortField(), sortConfig.getSortType());
    }
    return sort;
}