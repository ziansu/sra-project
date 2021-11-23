public com.couchbase.lite.store.ViewStore getViewStorage(java.lang.String name, boolean create) {
    try {
        return new com.couchbase.lite.store.SQLiteViewStore(this, name, create);
    } catch (com.couchbase.lite.CouchbaseLiteException ex) {
        return null;
    }
}