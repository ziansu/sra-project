public boolean isStorageExist(java.lang.String fileRelativePath) {
    java.io.File file = new java.io.File(fileRelativePath);
    return file.exists();
}