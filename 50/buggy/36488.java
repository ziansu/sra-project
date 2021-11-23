public java.lang.String getImageName(final java.io.File imagePath) {
    java.lang.String path = imagePath.toString();
    return path.substring(((path.lastIndexOf(java.io.File.separator)) + 1), path.indexOf("."));
}