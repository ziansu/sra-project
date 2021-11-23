private static java.lang.String encodedPath(java.lang.String path) {
    java.lang.String[] paths = path.split("/");
    java.lang.String[] encodedPaths = new java.lang.String[paths.length];
    for (int i = 0; i < (paths.length); i++) {
        encodedPaths[i] = controllers.HttpUtil.encodeUrlString(paths[i]);
    }
    return java.lang.String.join("/", encodedPaths);
}