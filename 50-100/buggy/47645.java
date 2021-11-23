@java.lang.Override
public java.util.List<java.lang.String> getAllViewNames() {
    java.util.List<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] fileNames = new java.io.File(directory).list();
    for (java.lang.String filename : fileNames) {
        try {
            result.add(com.couchbase.lite.store.ForestDBViewStore.fileNameToViewName(filename));
        } catch (com.couchbase.lite.CouchbaseLiteException e) {
            com.couchbase.lite.util.Log.i(com.couchbase.lite.store.ForestDBStore.TAG, ("Invalid filename as a view store: filename=" + filename));
        }
    }
    return result;
}