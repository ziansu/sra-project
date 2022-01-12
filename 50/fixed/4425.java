@java.lang.Override
public void onConnectionStatus(boolean isConnected) {
    if (!isConnected) {
        setRunState(DaeRunState.UNKNOWN);
    }
}