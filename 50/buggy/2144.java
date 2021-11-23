@java.lang.Override
public void onConnectionStatus(boolean isConnected) {
    setDisconnected((!isConnected));
    if (!isConnected) {
        setValue("disconnected");
    }
}