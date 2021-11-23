private java.io.File getDestinationFile(java.lang.String path, java.lang.String filename) {
    java.lang.String destFolderSuffix = "";
    return new java.io.File((((((path + destFolderSuffix) + (java.io.File.separator)) + filename) + ".") + (this.currentTempExtension)));
}