private java.lang.String curDir(java.lang.String directory) {
    java.io.File folder = new java.io.File(directory);
    return folder.getAbsolutePath();
}