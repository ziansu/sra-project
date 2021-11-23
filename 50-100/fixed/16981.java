public static byte[] readBytesFromFile(java.nio.file.Path path) throws webserver.WebException {
    byte[] encoded;
    try {
        encoded = java.nio.file.Files.readAllBytes(path);
    } catch (java.io.IOException e) {
        throw new webserver.HTMLReadException(("Could not read " + path));
    }
    return encoded;
}