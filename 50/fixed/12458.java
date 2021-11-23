@com.facebook.react.bridge.ReactMethod
public void getMacAddress(final com.facebook.react.bridge.Callback callback) {
    android.net.wifi.WifiInfo info = wifi.getConnectionInfo();
    java.lang.String macAddress = wInfo.getMacAddress();
    callback.invoke(macAddress);
}