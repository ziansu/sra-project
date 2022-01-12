public com.ibm.watson.developer_cloud.discovery.v1.model.document.CreateDocumentRequest.Builder file(java.io.File inputFile, java.lang.String mediaType) {
    java.io.InputStream file;
    try {
        file = new java.io.FileInputStream(inputFile);
        this.mediaType = mediaType;
    } catch (java.io.FileNotFoundException e) {
        file = null;
    }
    this.file = file;
    return this;
}