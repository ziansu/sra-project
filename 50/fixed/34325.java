@java.lang.Override
public void onNetworkConnected() {
    if ((!(socketService.connected())) && ((token) != null)) {
        reconnect();
    }
}