public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    if (wanted.contains(file)) {
        write(file, cleanBody(scrape(file.toString())));
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}