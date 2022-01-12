public static java.io.InputStream internalFileToStream(java.lang.Class<?> c, java.lang.String path) {
    return c.getResourceAsStream(path);
}