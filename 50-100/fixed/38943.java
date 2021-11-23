public void close() {
    try {
        if ((serverWriter) != null) {
            serverWriter.close();
        }
        if ((serverReader) != null) {
            serverReader.close();
        }
        if ((secureSocket) != null) {
            secureSocket.close();
        }
    } catch (java.io.IOException e) {
    }
}