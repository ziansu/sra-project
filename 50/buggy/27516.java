@java.lang.Override
public void onClose(int code, java.lang.String reason) {
    this.webSocket = null;
    this.streamState = com.apigee.zettakit.ZIKStream.ZIKStreamState.CLOSED;
    this.cancelPingTimer();
    if ((streamListener) != null) {
        streamListener.onClose();
    }
}