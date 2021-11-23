public static java.lang.String guaranteeEndWithSeparator(java.lang.String path) {
    if ((path != null) && (!(path.endsWith(java.io.File.separator)))) {
        path = path + (java.io.File.separator);
    }
    return path;
}