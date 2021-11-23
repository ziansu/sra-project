public void cancel() {
    try {
        mmCSocket.close();
    } catch (java.io.IOException e) {
        showMessage("Client Socket close error");
    }
}