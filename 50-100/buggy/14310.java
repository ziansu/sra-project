@java.lang.Override
public java.nio.file.FileVisitResult visitFile(java.nio.file.Path path, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    logger.info(("visit file: " + (path.toFile().getAbsolutePath())));
    if (acceptPath(path, attrs)) {
        com.marklogic.client.file.DocumentFile documentFile = buildDocumentFile(path, currentRootPath);
        documentFile = processDocumentFile(documentFile);
        if (documentFile != null) {
            this.documentFiles.add(documentFile);
        }
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}