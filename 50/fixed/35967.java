private java.lang.String optimize(java.lang.String path) {
    java.lang.String result = path.replaceAll("^/|/$", "");
    if (result.equals("")) {
        return result;
    }
    return "/" + result;
}