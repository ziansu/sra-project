public boolean isIgnored(java.lang.String path) {
    return _ignored.contains(new java.io.File(path));
}