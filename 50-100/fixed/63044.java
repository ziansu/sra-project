public java.io.File getFile(java.lang.String fileDir, java.lang.String fileName) {
    if (fileDir != null) {
        java.io.File dirPath = new java.io.File(fileDir, value);
        dirPath.mkdirs();
        return new java.io.File(dirPath, (fileName + (fileExtension)));
    }
    return getFile(fileName);
}