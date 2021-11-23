public static void clearFile(java.io.File file) throws java.io.IOException {
    java.nio.file.Files.delete(file.toPath());
    file.createNewFile();
}