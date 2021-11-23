void cancelSendOverNetwork() {
    try {
        networkServer.disconnect();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}