@com.couchbase.lite.internal.InterfaceAudience.Public
public java.lang.String getCurrentRevisionId() {
    return (getCurrentRevision()) == null ? null : getCurrentRevision().getId();
}