public void exit() {
    if ((aptoideMessageClientSocket) != null) {
        aptoideMessageClientSocket.exit();
    }
    if ((aptoideMessageServerSocket) != null) {
        aptoideMessageServerSocket.shutdown();
    }
}