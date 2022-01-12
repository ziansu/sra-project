public void close() {
    try {
        if ((reader) != null) {
            reader.close();
        }
    } catch (final java.io.IOException ex) {
        ex.printStackTrace();
    }
}