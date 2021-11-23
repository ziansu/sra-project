@java.lang.Override
public java.util.List<java.lang.String> read(java.lang.String fileName) throws java.io.IOException {
    return java.nio.file.Files.readAllLines(java.nio.file.Paths.get(dbPath, fileName), charset);
}