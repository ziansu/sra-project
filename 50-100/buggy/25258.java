private static java.lang.String escapeViewName(java.lang.String viewName) throws com.couchbase.lite.CouchbaseLiteException {
    try {
        viewName = java.net.URLEncoder.encode(viewName, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        com.couchbase.lite.util.Log.w(com.couchbase.lite.store.ForestDBViewStore.TAG, ("Error to url decode: " + viewName), e);
        throw new com.couchbase.lite.CouchbaseLiteException(e, com.couchbase.lite.Status.BAD_ENCODING);
    }
    viewName = viewName.replaceAll("\\*", "%2A");
    return viewName;
}