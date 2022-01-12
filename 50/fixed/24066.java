public void cancel() {
    try {
        mmCSocket.close();
    } catch (java.io.IOException e) {
    }
}