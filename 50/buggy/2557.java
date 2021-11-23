static java.lang.String readFile(java.lang.String path, java.nio.charset.Charset encoding) throws java.io.IOException {
    byte[] encoded = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(path));
    return new java.lang.String(encoded, encoding);
}