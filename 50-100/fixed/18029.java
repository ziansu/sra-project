private static java.lang.String getExtension(java.lang.String fileName) {
    if (fileName == null) {
        return "";
    }
    int dotIndex = fileName.lastIndexOf('.');
    if (dotIndex == (-1)) {
        return "";
    }
    return fileName.substring((dotIndex + 1), fileName.length()).toLowerCase();
}