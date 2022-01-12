private static java.lang.String extractExtension(java.lang.String path) {
    java.lang.String unixPath = org.arthan.semantic.desktop.sample.FileUtils.toUnixPath(path);
    int lastSlash = unixPath.lastIndexOf("/");
    java.lang.String fileName = unixPath.substring((lastSlash + 1));
    int lastDot = fileName.lastIndexOf(".");
    return fileName.substring((lastDot + 1));
}