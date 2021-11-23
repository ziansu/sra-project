public synchronized void disconnect() {
    if ((serviceMessenger) != null) {
        disconnectFromService();
    }
    if ((serviceConnection) != null) {
        context.unbindService(serviceConnection);
    }
}