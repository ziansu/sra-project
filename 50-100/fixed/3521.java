private boolean importDocumentIDs() {
    try {
        java.io.ObjectInputStream input = new java.io.ObjectInputStream(new java.io.FileInputStream(new java.io.File(((src.HashedIndex.CACHE_PATH) + (src.HashedIndex.DOCUMENT_ID_FILE_NAME)))));
        super.docIDs = ((java.util.HashMap<java.lang.String, java.lang.String>) (input.readObject()));
        input.close();
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}