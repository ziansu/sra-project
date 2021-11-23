private static java.lang.String extractExtension(java.lang.String path) {
    java.lang.String unixPath = org.arthan.semantic.desktop.sample.FileUtils.toUnixPath(path);
    int lastSlash = unixPath.lastIndexOf("/");
    int lastDot = unixPath.indexOf(".", lastSlash);
    return unixPath.substring((lastDot + 1));
}