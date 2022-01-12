@com.couchbase.lite.internal.InterfaceAudience.Private
void loadCurrentRevisionFrom(com.couchbase.lite.QueryRow row) {
    if ((row.getDocumentRevisionId()) == null) {
        return ;
    }
    java.lang.String revId = row.getDocumentRevisionId();
    if (((currentRevision) == null) || (revIdGreaterThanCurrent(revId))) {
        java.util.Map<java.lang.String, java.lang.Object> properties = row.getDocumentProperties();
        if (properties != null) {
            com.couchbase.lite.internal.RevisionInternal rev = new com.couchbase.lite.internal.RevisionInternal(properties);
            currentRevision = new com.couchbase.lite.SavedRevision(this, rev);
        }
    }
}