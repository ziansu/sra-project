private boolean isEmpty(java.nio.file.Path filePath) {
    try (java.io.InputStream stream = filePath.toUri().toURL().openStream()) {
        if ((stream.available()) > 0) {
            return false;
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return true;
    }
    return false;
}