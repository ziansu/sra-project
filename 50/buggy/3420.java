public void stop() {
    if (isWaitingData) {
        isWaitingData = false;
        shouldAutomaticallyReconnect = false;
    }
    closeSocket();
    closeInputStream();
    closeOutputStream();
    inputStream = null;
    outputStream = null;
    socket = null;
}