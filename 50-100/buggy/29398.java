private java.io.File getDestinationFile(java.lang.String path, java.lang.String filename) {
    java.lang.String destFolderSuffix = "";
    java.io.File file = new java.io.File((((((path + destFolderSuffix) + (java.io.File.separator)) + filename) + ".") + (this.currentTempExtension)));
    return file;
}