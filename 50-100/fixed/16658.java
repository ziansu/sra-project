private java.lang.String loadAnswer(final java.lang.String filename) {
    java.nio.file.Path path = java.nio.file.Paths.get((((((grace.tests.Tests.userDirectory) + (grace.tests.Tests.somDirectory)) + (grace.tests.Tests.testDirectory)) + filename) + (extensionAnswer)));
    byte[] encoded;
    try {
        encoded = java.nio.file.Files.readAllBytes(path);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(("Failed to read " + path));
    }
    return new java.lang.String(encoded, java.nio.charset.StandardCharsets.UTF_8);
}