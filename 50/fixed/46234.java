public static java.lang.String canonicalPath(java.io.File file) {
    if (file == null) {
        return null;
    }
    try {
        return file.getCanonicalPath();
    } catch (java.lang.Exception e) {
        return file.getAbsolutePath();
    }
}