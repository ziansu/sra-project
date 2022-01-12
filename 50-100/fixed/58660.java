public void writeGeneralFile(java.io.File file, java.lang.String data) throws java.io.IOException {
    java.nio.file.Path filename = java.nio.file.Paths.get(file.getPath());
    if (!(java.nio.file.Files.exists(filename))) {
        java.nio.file.Files.createFile(filename);
    }else {
        java.nio.file.Files.delete(filename);
        java.nio.file.Files.createFile(filename);
    }
    java.nio.file.Files.write(filename, data.getBytes(), java.nio.file.StandardOpenOption.APPEND);
}