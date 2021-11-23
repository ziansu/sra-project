public void putBufferFromFile(java.io.File file) {
    ensure((end = file.length()));
    rewind();
    try {
        putByteArray(java.nio.file.Files.readAllBytes(file.toPath()), false);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}