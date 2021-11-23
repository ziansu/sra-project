public void initialize(java.lang.String hdfsFolder, java.lang.String hdfsFile) throws java.lang.Exception {
    this.hdfsFolder = hdfsFolder;
    this.hdfsFile = ((this.hdfsFolder) + "/") + hdfsFile;
}