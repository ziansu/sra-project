public java.lang.String getExtension() {
    int i = filename.lastIndexOf('.');
    if (i > 0) {
        return filename.substring(i);
    }
    return "";
}