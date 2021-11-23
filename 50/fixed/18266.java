private void closeWifiAp() {
    if ((mWifiApService) != null) {
        mWifiApService.setOnWifiApStatusListener(null);
        mWifiApService.closeWifiAp();
    }
    unBindService();
    stopService();
}