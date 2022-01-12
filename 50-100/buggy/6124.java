private void addQueryIntegerListFilter(java.lang.String optionKey, java.lang.String queryKey, org.opencb.opencga.catalog.db.DBObject query, org.opencb.datastore.core.QueryOptions options) {
    if (options.containsKey(optionKey)) {
        java.util.List<java.lang.Integer> integerList = options.getAsIntegerList(optionKey);
        if ((integerList.size()) > 1) {
            query.put(queryKey, new org.opencb.opencga.catalog.db.BasicDBObject("$in", integerList));
        }else
            if ((integerList.size()) == 1) {
                query.put(queryKey, integerList.get(0));
            }
        
    }
}