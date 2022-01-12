public java.lang.String getContentByCharPos(int docId, java.lang.String fieldName, int startAtChar, int endAtChar) {
    org.apache.lucene.document.Document d = document(docId);
    if (!(contentStores.exists(fieldName))) {
        return d.get(fieldName).substring(startAtChar, endAtChar);
    }
    return contentStores.getSubstrings(fieldName, d, new int[]{ startAtChar }, new int[]{ endAtChar })[0];
}