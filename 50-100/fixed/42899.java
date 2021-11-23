public static java.lang.String getFileName(java.lang.String filePath) {
    filePath = filePath.substring(((filePath.lastIndexOf("/")) + 1), filePath.length());
    filePath = filePath.substring(((filePath.lastIndexOf("\\")) + 1), filePath.length());
    return filePath;
}