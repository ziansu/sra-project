public com.couchbase.lite.store.ViewStore getViewStorage(java.lang.String name, boolean create) throws com.couchbase.lite.CouchbaseLiteException {
    return new com.couchbase.lite.store.SQLiteViewStore(this, name, create);
}