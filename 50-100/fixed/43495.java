@java.lang.Override
public java.io.InputStream getFile(java.lang.String path) {
    java.nio.file.Path file = getAndValidatePath(path);
    if ((!(java.nio.file.Files.exists(file))) || (java.nio.file.Files.isDirectory(file))) {
        return null;
    }
    return calc(() -> java.nio.file.Files.newInputStream(file));
}