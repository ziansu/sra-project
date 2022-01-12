protected static java.lang.String fileNameToViewName(java.lang.String fileName) throws com.couchbase.lite.CouchbaseLiteException {
    if ((!(fileName.endsWith(com.couchbase.lite.store.ForestDBViewStore.kViewIndexPathExtension))) || (fileName.startsWith(".")))
        throw new com.couchbase.lite.CouchbaseLiteException(com.couchbase.lite.Status.BAD_PARAM);
    
    java.lang.String viewName = fileName.substring(0, fileName.indexOf("."));
    return com.couchbase.lite.store.ForestDBViewStore.unescapeViewName(viewName);
}