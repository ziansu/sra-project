public static boolean isCurrentlyConnectedToVenuesWifi(@android.support.annotation.NonNull
android.content.Context context) {
    final android.net.wifi.WifiManager wifiManager = ((android.net.wifi.WifiManager) (context.getApplicationContext().getSystemService(Context.WIFI_SERVICE)));
    android.net.wifi.WifiInfo wifiInfo = wifiManager.getConnectionInfo();
    return (wifiInfo != null) && (fr.paug.androidmakers.util.WifiUtil.SSID.equals(wifiInfo.getSSID()));
}