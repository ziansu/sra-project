public java.lang.String getExtension(final java.io.File f) {
    if (f != null) {
        java.lang.String filename = f.getName();
        int i = filename.lastIndexOf('.');
        if ((i > 0) && (i < ((filename.length()) - 1))) {
            return filename.substring((i + 1)).toLowerCase();
        }
    }
    return null;
}