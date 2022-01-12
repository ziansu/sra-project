public boolean createFolder(java.lang.String fileLoc) throws java.io.IOException, java.lang.InterruptedException {
    java.io.File file = new java.io.File(fileLoc);
    return file.mkdir();
}