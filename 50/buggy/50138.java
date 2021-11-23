@com.couchbase.lite.internal.InterfaceAudience.Public
public java.lang.String getCurrentRevisionId() {
    com.couchbase.lite.SavedRevision rev = getCurrentRevision();
    if (rev == null) {
        return null;
    }
    return rev.getId();
}