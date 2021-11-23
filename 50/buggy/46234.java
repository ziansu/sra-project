public static java.lang.String canonicalPath(java.io.File file) {
    try {
        return file.getCanonicalPath();
    } catch (java.lang.Exception e) {
        return file.getAbsolutePath();
    }
}