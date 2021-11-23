private java.lang.String selectNumberSubpath(java.lang.String path) {
    java.lang.String subpath = path.substring(0, path.lastIndexOf('.'));
    return subpath;
}