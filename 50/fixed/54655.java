private static java.util.List<java.lang.String> read(java.nio.file.Path path) throws java.io.IOException {
    return java.nio.file.Files.readAllLines(path, com.google.common.base.Charsets.UTF_8);
}