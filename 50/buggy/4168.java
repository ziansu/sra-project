@java.lang.Override
public void close() throws java.io.IOException {
    reader.close();
    if ((index) != null) {
        java.nio.file.Files.deleteIfExists(index);
    }
}