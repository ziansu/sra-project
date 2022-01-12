private void addQueryIntegerListFilter(java.lang.String optionKey, org.opencb.datastore.core.QueryOptions options, java.lang.String queryKey, org.opencb.opencga.catalog.db.DBObject query) {
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