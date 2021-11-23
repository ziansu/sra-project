@java.lang.Override
protected void onResume() {
    super.onResume();
    isFirstScan = true;
    registerReceiver(mWifiScanReceiver, new android.content.IntentFilter(android.net.wifi.WifiManager.SCAN_RESULTS_AVAILABLE_ACTION));
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction(WifiManager.NETWORK_STATE_CHANGED_ACTION);
    filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    registerReceiver(mWifiChangeReceiver, filter);
    boolean mSuccess = false;
    mSuccess = mWifiManger.startScan();
    android.util.Log.e("WifiChangeReceiver", ("scan result :" + mSuccess));
    showProgressDialog("Scan WiFi...");
}