private com.couchbase.lite.Document getDocument(java.lang.String docID, boolean mustExist) throws com.couchbase.lite.CouchbaseLiteException {
    com.couchbase.lite.Document doc = documents.get(docID);
    if (doc == null) {
        doc = new com.couchbase.lite.DocumentImpl(this, docID, mustExist);
        documents.put(docID, doc);
    }else {
        if (mustExist && (!(doc.exists()))) {
            throw new com.couchbase.lite.CouchbaseLiteException(com.couchbase.litecore.Constants.C4ErrorDomain.LiteCoreDomain, com.couchbase.litecore.Constants.LiteCoreError.kC4ErrorNotFound);
        }
    }
    return doc;
}