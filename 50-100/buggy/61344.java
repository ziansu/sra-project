public static java.lang.String makeFilePath(java.lang.String path) {
    while (path.startsWith("/")) {
        path = path.substring(1);
    } 
    if (!(path.endsWith("index.html"))) {
        if (!(path.endsWith("/"))) {
            path = path + "/";
        }
        path = path + "index.html";
    }
    return path;
}