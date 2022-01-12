@java.lang.Override
public void end() {
    try {
        if ((tempFile) != null) {
            java.nio.file.Files.deleteIfExists(tempFile.toPath());
        }
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}