public java.lang.String getImageName(final java.io.File file) {
    java.lang.String path = file.toString();
    return path.substring(((path.lastIndexOf(java.io.File.separator)) + 1), path.indexOf("."));
}