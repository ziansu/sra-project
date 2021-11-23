public void disconnect() {
    if ((_socket) != null) {
        try {
            _socket.close();
        } catch (java.lang.Exception ex) {
        }
        cancelDateTimer();
        _socket = null;
        android.util.Log.d(jwtc.android.chess.ics.ICSClient.TAG, "disconnect method");
    }
}