public static java.lang.String toSystemPath(java.lang.String rawpath) {
    java.nio.file.Path path = java.nio.file.FileSystems.getDefault().getPath(rawpath);
    if (java.nio.file.Files.exists(path)) {
        try {
            path = path.toRealPath();
        } catch (java.io.IOException e) {
            path = path.toAbsolutePath();
            e.printStackTrace();
        }
    }else {
        path = path.toAbsolutePath();
    }
    return path.toString();
}