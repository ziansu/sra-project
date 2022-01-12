public com.couchbase.lite.Status do_DELETE_Database(com.couchbase.lite.Database _db, java.lang.String _docID, java.lang.String _attachmentName) throws com.couchbase.lite.CouchbaseLiteException {
    if ((getQuery("rev")) != null) {
        return new com.couchbase.lite.Status(com.couchbase.lite.Status.BAD_REQUEST);
    }
    db.delete();
    return new com.couchbase.lite.Status(com.couchbase.lite.Status.OK);
}