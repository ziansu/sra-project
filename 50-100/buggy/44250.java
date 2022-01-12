@java.lang.Override
public java.nio.file.FileVisitResult visitFile(java.nio.file.Path filePath, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    java.lang.String fileName = filePath.getFileName().toString();
    int dotPosition = fileName.lastIndexOf(".");
    java.lang.String extension = fileName.substring((dotPosition + 1)).toUpperCase();
    if (fileExtensions.contains(extension)) {
        fileList.put(fileName, filePath);
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}