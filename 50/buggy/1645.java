@java.lang.Override
public void onError(java.lang.Exception error) {
    logWarning((("WebSocketClient(" + (this.remoteAddress)) + ").onError"), error);
    this.endpoint.dispose();
}