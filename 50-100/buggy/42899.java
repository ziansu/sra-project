public static java.lang.String getFileName(java.lang.String filePath) {
    return filePath.substring(((filePath.lastIndexOf("/")) + 1), filePath.length()).substring(((filePath.lastIndexOf("\\")) + 1), filePath.length());
}