@java.lang.Override
public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    java.nio.file.Files.move(file, encryptedDestination2.resolve(encryptedDestination.relativize(file)));
    return java.nio.file.FileVisitResult.CONTINUE;
}