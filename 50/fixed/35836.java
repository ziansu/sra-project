@com.couchbase.lite.internal.InterfaceAudience.Private
public com.couchbase.lite.Status updateIndexAlone() throws com.couchbase.lite.CouchbaseLiteException {
    return updateIndexes(java.util.Arrays.asList(this));
}