private void closeWifiAp() {
    if (isWifiApEnabled()) {
        setWifiApEnabled(getWifiApConfiguration(), false);
    }
}