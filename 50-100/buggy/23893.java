private void addQueryStringListFilter(java.lang.String optionKey, java.lang.String queryKey, org.opencb.opencga.catalog.db.DBObject query, org.opencb.datastore.core.QueryOptions options) {
    if (options.containsKey(optionKey)) {
        java.util.List<java.lang.String> stringList = options.getAsStringList(optionKey);
        if ((stringList.size()) > 1) {
            query.put(queryKey, new org.opencb.opencga.catalog.db.BasicDBObject("$in", stringList));
        }else
            if ((stringList.size()) == 1) {
                query.put(queryKey, stringList.get(0));
            }
        
    }
}