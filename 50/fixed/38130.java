public void pause() {
    if ((networkStateReceiver.isConnected()) && (!(socketService.connected()))) {
        reconnect();
    }
    isPaused = true;
}