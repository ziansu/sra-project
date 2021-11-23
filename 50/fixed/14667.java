@com.facebook.react.bridge.ReactMethod
public void stopLocationHeartBeat() {
    if ((receiver) != null) {
        android.content.Intent stopMonitorIntent = new android.content.Intent("STOP_MONITOR_LOCATION");
        getReactApplicationContext().sendBroadcast(stopMonitorIntent);
        receiver = null;
    }
}