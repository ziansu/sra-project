@com.facebook.react.bridge.ReactMethod
public void stopLocationHeartBeat(com.botree.locationheartbeat.Callback successCallback, com.botree.locationheartbeat.Callback errorCallback) {
    if ((receiver) != null) {
        android.content.Intent stopMonitorIntent = new android.content.Intent("STOP_MONITOR_LOCATION");
        getReactApplicationContext().sendBroadcast(stopMonitorIntent);
    }
}