private void deleteFiles(java.util.List<java.lang.String> files, java.lang.String path) {
    java.io.File f;
    for (java.lang.String str : files) {
        f = new java.io.File(str);
        f.delete();
    }
    f = new java.io.File(path);
    f.delete();
}