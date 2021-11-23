public static java.lang.String getCurrentWifiLink(android.content.Context context) {
    if (context == null)
        return null;
    
    final android.net.wifi.WifiManager wifiMgr = ((android.net.wifi.WifiManager) (context.getSystemService(Context.WIFI_SERVICE)));
    final android.net.wifi.WifiInfo connectedWifi = wifiMgr.getConnectionInfo();
    final java.lang.String connectedSSID = ((connectedWifi == null) || ((connectedWifi.getSSID()) == null)) ? null : connectedWifi.getSSID().replace("\"", "");
    return connectedSSID;
}