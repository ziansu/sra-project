public void resume() {
    if ((networkStateReceiver.isConnected()) && (!(socketService.connected()))) {
        reconnect();
    }
    isPaused = false;
}