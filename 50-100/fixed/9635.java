public void setIsWifiEnable(boolean isWifiEnable) {
    isWifiP2pEnable = isWifiEnable;
    if (isRemainResult) {
        remainWifiIsEnable = isWifiEnable;
    }
    if ((mOnWiFiRecevieListener) != null) {
        mOnWiFiRecevieListener.onWifiStatusResult(isWifiEnable);
    }else {
        if (!isWifiEnable) {
        }
    }
}