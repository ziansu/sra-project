public static void touch(java.nio.file.Path file, java.nio.file.attribute.FileTime timestamp) throws java.io.IOException {
    if (!(java.nio.file.Files.exists(file))) {
        java.nio.file.Path parent = file.getParent();
        if (!(java.nio.file.Files.exists(parent))) {
            java.nio.file.Files.createDirectories(parent);
        }
        java.nio.file.Files.createFile(file);
    }
    java.nio.file.Files.setLastModifiedTime(file, timestamp);
}