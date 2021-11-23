public void close() {
    try {
        reader.close();
    } catch (final java.io.IOException ex) {
        ex.printStackTrace();
    }
}