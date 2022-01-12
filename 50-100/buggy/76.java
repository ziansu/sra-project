private void getWifiInfo() {
    wifiDataReceived = false;
    android_network.hetnet.network.NetworkListFetcher.wifiManager = ((android.net.wifi.WifiManager) (getSystemService(Context.WIFI_SERVICE)));
    android_network.hetnet.network.NetworkListFetcher.startT = java.lang.System.currentTimeMillis();
    registerReceiver(wifiReceiver, new android.content.IntentFilter(android.net.wifi.WifiManager.SCAN_RESULTS_AVAILABLE_ACTION));
    android_network.hetnet.network.NetworkListFetcher.wifiManager.startScan();
    try {
        unregisterReceiver(wifiReceiver);
    } catch (java.lang.IllegalArgumentException e) {
        android.util.Log.e(LOG_TAG, "Error unregistering receiver in getWifiInfo");
    }
}