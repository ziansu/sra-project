private void transportError(java.lang.Exception error) {
    onCall.onError(new io.socket.nativeclient.SocketIOException(error));
}