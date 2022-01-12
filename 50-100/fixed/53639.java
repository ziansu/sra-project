private java.util.List<java.lang.String> parsePathsProperty(java.lang.String commaSeparatedPaths) {
    java.util.List<java.lang.String> paths = new java.util.ArrayList<java.lang.String>();
    if (commaSeparatedPaths != null) {
        for (java.lang.String path : commaSeparatedPaths.split(",")) {
            path = cleanupPath(path);
            if (!(path.equals(""))) {
                paths.add(path);
            }
        }
    }else {
        paths.add("lib");
    }
    return paths;
}