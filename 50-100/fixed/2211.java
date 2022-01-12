public static java.lang.String getFile(final java.lang.String filename) {
    java.lang.String tmp = new java.lang.String(filename);
    tmp = tmp.replace('\\', '/');
    final int i = tmp.lastIndexOf('/');
    return i != (-1) ? tmp.substring((i + 1)) : tmp;
}