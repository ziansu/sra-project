private void stopUserServer() {
    f_userServerReady = false;
    f_userConnection = null;
    f_userServerConnection.setPort((-1));
    if ((f_userServerThread) != null) {
        f_userServerThread.interrupt();
        f_userServerThread = null;
    }
}