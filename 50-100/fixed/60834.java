@java.lang.Override
public void close() {
    if ((forest) != null) {
        try {
            forest.close();
        } catch (com.couchbase.cbforest.ForestException e) {
            com.couchbase.lite.util.Log.e(com.couchbase.lite.store.ForestDBStore.TAG, ("Failed to close Database: " + (forest)));
        }
        forest = null;
    }
}