public void onMuxClose(int channelId, org.eclipse.jetty.websocket.mux.MuxConnection connection) {
    _onControl.onClose(WebSocketConnectionRFC6455.CLOSE_NORMAL, "channel closed normally");
}