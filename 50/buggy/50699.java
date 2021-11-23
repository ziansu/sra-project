private java.lang.String getFileExt(java.lang.String filename) {
    java.lang.String ext = filename.substring(((filename.lastIndexOf(".")) + 1));
    return ext.toLowerCase();
}