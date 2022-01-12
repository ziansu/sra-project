public static java.lang.String makeFilePath(java.lang.String path) {
    if (!(path.endsWith("index.html"))) {
        if (!(path.endsWith("/"))) {
            path = path + "/";
        }
        path = path + "index.html";
    }
    while (path.startsWith("/")) {
        path = path.substring(1);
    } 
    return path;
}