private java.lang.String readFile() throws java.io.IOException {
    return java.nio.file.Files.readAllLines(path).stream().collect(java.util.stream.Collectors.joining());
}