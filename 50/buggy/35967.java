private java.lang.String optimize(java.lang.String path) {
    if (path.equals("")) {
        return path;
    }
    return "/" + (path.replaceAll("^/|/$", ""));
}