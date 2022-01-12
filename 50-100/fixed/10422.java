@java.lang.Override
protected byte[] getFromStore(long uid) throws java.io.IOException {
    int docid = mapDocId(uid);
    if (docid < 0)
        return null;
    
    org.apache.lucene.index.IndexReader reader = null;
    if ((_currentReaderData) != null) {
        reader = _currentReaderData.reader;
    }
    if ((docid >= 0) && (reader != null)) {
        org.apache.lucene.document.Document doc = reader.document(docid);
        if (doc != null) {
            return doc.getBinaryValue(_field);
        }
    }
    return null;
}