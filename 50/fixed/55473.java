public void disconnect() {
    thread.cancel();
    myThreadConnected.cancel();
    thread = null;
    myThreadConnected = null;
}