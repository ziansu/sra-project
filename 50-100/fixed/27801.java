private void handleWifiStateChanged(android.content.Intent intent) {
    int wifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, (-1));
    if (wifiState == (android.net.wifi.WifiManager.WIFI_STATE_ENABLED)) {
        android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Wi-Fi enabled");
        registerP2p();
        registerP2pReceiver();
    }else
        if (wifiState == (android.net.wifi.WifiManager.WIFI_STATE_DISABLED)) {
            android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Wi-Fi disabled");
            removeServiceDiscoveryRequest();
            removeService();
            unregisterP2pReceiver();
            unregisterP2p();
        }
    
    localBroadcastManager.sendBroadcast(new android.content.Intent(edu.rit.se.wifibuddy.WifiDirectHandler.Action.WIFI_STATE_CHANGED));
}