void enableBackgroundScan(boolean enable) {
    if (enable) {
        mWifiConfigStore.enableAllNetworks();
    }
    mWifiNative.enableBackgroundScan(enable);
}