public void onData(com.corundumstudio.socketio.SocketIOClient client, java.lang.String data, com.corundumstudio.socketio.AckRequest arg2) throws java.lang.Exception {
    work.applyPreFilter(java.lang.Integer.parseInt(data), client);
}