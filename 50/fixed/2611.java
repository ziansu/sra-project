public boolean isWiFiConnected() {
    return (mWifiManager.getConnectionInfo().getIpAddress()) != 0;
}