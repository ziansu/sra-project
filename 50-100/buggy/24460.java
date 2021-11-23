private com.microsoft.azure.documentdb.Document getDocumentById(java.lang.String collectionId, java.lang.String id) {
    java.util.List<com.microsoft.azure.documentdb.Document> documentList = com.yahoo.ycsb.db.DocumentDBClient.documentClient.queryDocuments(getCollection(collectionId).getSelfLink(), (("SELECT * FROM root r WHERE r.id='" + id) + "'"), null).getQueryIterable().toList();
    if ((documentList.size()) > 0) {
        return documentList.get(0);
    }else {
        return null;
    }
}