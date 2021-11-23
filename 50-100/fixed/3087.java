@java.lang.Override
public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    if (file.toFile().isDirectory())
        return java.nio.file.FileVisitResult.CONTINUE;
    
    if ((filter == null) || (filter.accept(file.toFile())))
        files.add(file);
    
    return java.nio.file.FileVisitResult.CONTINUE;
}