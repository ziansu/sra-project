private static boolean mkDirs(java.lang.String path) {
    java.io.File folder = new java.io.File(path);
    return (folder.mkdirs()) || (folder.isDirectory());
}