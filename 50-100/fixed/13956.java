@java.lang.Override
public boolean checkConnection(android.content.Context context) {
    android.net.wifi.WifiManager wifiManager = ((android.net.wifi.WifiManager) (context.getSystemService(Context.WIFI_SERVICE)));
    android.net.wifi.WifiInfo wifiInfo = wifiManager.getConnectionInfo();
    return ((wifiInfo != null) && ((wifiInfo.getSSID()) != null)) && (wifiInfo.getSSID().contains(de.tum.in.mislcontrol.communication.ASEPConnector.WIFI_SSID));
}