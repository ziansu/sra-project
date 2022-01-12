public java.lang.String getFileName(java.net.URL url) {
    java.lang.String fileName = url.getFile();
    return fileName.substring(((fileName.lastIndexOf('/')) + 1));
}