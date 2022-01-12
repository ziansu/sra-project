private java.lang.String getExtension(final java.lang.String filename) {
    final int i = filename.lastIndexOf('.');
    if ((i > 0) && (i < ((filename.length()) - 1))) {
        return filename.substring((i + 1)).toLowerCase();
    }
    return null;
}