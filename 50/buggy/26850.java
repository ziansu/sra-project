public org.apache.lucene.document.Document getDocumentById(int docId) {
    org.apache.lucene.document.Document doc = null;
    try {
        doc = this.indexReader.document(docId);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return doc;
}