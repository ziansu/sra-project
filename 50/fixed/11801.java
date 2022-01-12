public java.lang.String getExtension() {
    if ((filename) == null) {
        return "";
    }
    int i = filename.lastIndexOf('.');
    if (i > 0) {
        return filename.substring(i);
    }
    return "";
}