private static java.lang.String encodedPath(java.lang.String path) {
    java.lang.String[] paths = path.split("/");
    if ((paths.length) == 0) {
        return "/";
    }
    java.lang.String[] encodedPaths = new java.lang.String[paths.length];
    for (int i = 0; i < (paths.length); i++) {
        encodedPaths[i] = controllers.HttpUtil.encodeUrlString(paths[i]);
    }
    return java.lang.String.join("/", encodedPaths);
}