private void saveByteArray() {
    try {
        java.nio.file.Files.write(path, byteArray);
    } catch (java.io.IOException e) {
    }
}