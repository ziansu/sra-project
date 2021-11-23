private boolean isFile(java.lang.String filePath) {
    if (filePath == null) {
        return false;
    }
    java.io.File f = new java.io.File(filePath);
    return (f.exists()) && (!(f.isDirectory()));
}