private boolean isEmpty(java.nio.file.Path filePath) {
    try (java.io.InputStream stream = filePath.toUri().toURL().openStream()) {
        if ((stream.available()) > 1) {
            return true;
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
    return false;
}