private void setFileFromDirectoryAndName() throws java.io.FileNotFoundException {
    file = new java.io.File((((directory) + (java.io.File.separator)) + (fileName)));
    if (file.exists()) {
        randomAccessFile = null;
        lastModified = file.lastModified();
        size = file.length();
    }else {
        deleted = true;
    }
}