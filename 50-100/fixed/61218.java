public void putBufferFromFile(java.io.File file) {
    rewind();
    ensure((end = file.length()));
    try {
        putByteArray(java.nio.file.Files.readAllBytes(file.toPath()), false);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}