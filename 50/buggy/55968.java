@java.lang.Override
protected void onStart() {
    super.onStart();
    mWifiEnableBtn.setClickable(true);
    wifiStateChangeViewUpdate(mWifiManager.isWifiEnabled());
    if (mWifiManager.isWifiEnabled()) {
        mWifiManager.startScan();
        initScanResults();
    }
}