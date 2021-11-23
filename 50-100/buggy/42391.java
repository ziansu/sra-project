public com.papao.books.model.DocumentData saveDocument(java.lang.String localFile, java.lang.String description, java.lang.String contentType) throws java.io.IOException {
    java.io.File file = new java.io.File(localFile);
    if ((!(file.exists())) || (!(file.isFile()))) {
        throw new java.io.IOException((("File " + localFile) + " is invalid!"));
    }
    return saveDocument(file, null, description, contentType);
}