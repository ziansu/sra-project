@com.couchbase.lite.internal.InterfaceAudience.Private
protected java.util.List<com.couchbase.lite.SavedRevision> getLeafRevisions(boolean includeDeleted) throws com.couchbase.lite.CouchbaseLiteException {
    java.util.List<com.couchbase.lite.SavedRevision> result = new java.util.ArrayList<com.couchbase.lite.SavedRevision>();
    com.couchbase.lite.RevisionList revs = database.getStore().getAllRevisions(documentId, true);
    if (revs != null) {
        for (com.couchbase.lite.internal.RevisionInternal rev : revs) {
            if ((!includeDeleted) && (rev.isDeleted())) {
            }else {
                result.add(getRevisionFromRev(rev));
            }
        }
    }
    return java.util.Collections.unmodifiableList(result);
}