@java.lang.Override
public java.io.InputStream getFile(java.lang.String path) {
    java.nio.file.Path file = getAndValidatePath(path);
    if ((!(java.nio.file.Files.exists(file))) || (java.nio.file.Files.isDirectory(file))) {
        throw new java.lang.IllegalArgumentException("File doesn't exist or is a directory");
    }
    return calc(() -> java.nio.file.Files.newInputStream(file));
}