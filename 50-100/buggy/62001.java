@java.lang.Override
public void onConnectEvent(java.lang.String ipAddr, int port, long timestamp, int uid) {
    if (!(mIsLoggingEnabled)) {
        return ;
    }
    android.app.admin.ConnectEvent connectEvent = new android.app.admin.ConnectEvent(ipAddr, port, mPm.getNameForUid(uid), timestamp);
    sendNetworkEvent(connectEvent);
}