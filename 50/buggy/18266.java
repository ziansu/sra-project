private void closeWifiAp() {
    mWifiApService.setOnWifiApStatusListener(null);
    mWifiApService.closeWifiAp();
    unBindService();
    stopService();
}