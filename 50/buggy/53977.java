@java.lang.Override
public java.util.List<java.lang.String> read(java.lang.String fileName) throws java.io.IOException {
    java.util.List<java.lang.String> lines = java.nio.file.Files.readAllLines(java.nio.file.Paths.get(dbPath, fileName), charset);
    return lines;
}