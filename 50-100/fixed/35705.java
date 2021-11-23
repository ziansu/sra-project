public static java.lang.String cleanRelativePath(java.lang.String path) {
    java.lang.String newPath = path;
    if (!(java.lang.System.getProperty("path.separator").equals("\\"))) {
        newPath = newPath.replaceAll("/", java.lang.System.getProperty("file.separator"));
    }
    return newPath;
}