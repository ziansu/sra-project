@java.lang.Override
public void onClose(int code, java.lang.String reason) {
    this.streamState = com.apigee.zettakit.ZIKStream.ZIKStreamState.CLOSED;
    this.cancelPingTimer();
    this.webSocket = null;
    if ((streamListener) != null) {
        streamListener.onClose();
    }
}