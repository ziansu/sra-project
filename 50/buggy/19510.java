@java.lang.Override
public java.nio.file.FileVisitResult preVisitDirectory(final java.nio.file.Path dir, final java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    if (dir.getFileName().toString().equals("settings")) {
        return java.nio.file.FileVisitResult.SKIP_SUBTREE;
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}