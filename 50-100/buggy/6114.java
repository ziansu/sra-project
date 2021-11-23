public java.lang.String getContentByCharPos(int docId, java.lang.String fieldName, int startAtChar, int endAtChar) {
    if (!(contentStores.exists(fieldName))) {
        org.apache.lucene.document.Document d = document(docId);
        return d.get(fieldName).substring(startAtChar, endAtChar);
    }
    return contentStores.getSubstrings(fieldName, docId, new int[]{ startAtChar }, new int[]{ endAtChar })[0];
}