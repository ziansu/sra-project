public java.nio.file.Path download(java.lang.String path, java.nio.file.Path destinationDir) throws java.io.IOException {
    if (!(java.nio.file.Files.exists(destinationDir))) {
        java.nio.file.Files.createDirectories(destinationDir);
    }
    return download(path, "GET", MediaType.APPLICATION_OCTET_STREAM, destinationDir);
}