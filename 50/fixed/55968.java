@java.lang.Override
protected void onStart() {
    super.onStart();
    wifiStateChangeViewUpdate(mWifiManager.isWifiEnabled());
    if (mWifiManager.isWifiEnabled()) {
        mWifiManager.startScan();
        initScanResults();
    }
}