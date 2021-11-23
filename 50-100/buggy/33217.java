private java.lang.String getBasePathOf(java.net.URL url) {
    java.lang.String path = url.getPath();
    if (path.endsWith("/")) {
        return path;
    }
    int i = path.lastIndexOf('/');
    path = path.substring(0, (i + 1));
    return path + "/";
}