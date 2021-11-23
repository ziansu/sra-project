private void openSocket(int port) throws java.lang.Exception {
    socket = new java.net.Socket(IP, port);
    android.util.Log.d("openSocket", "openSocket");
}