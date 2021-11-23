public void onMuxOpen(int channelId, org.eclipse.jetty.websocket.mux.MuxConnection connection) {
    _onControl.onOpen(connection);
}