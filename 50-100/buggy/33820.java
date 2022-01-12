private void putWifiResults(java.util.List<android.net.wifi.ScanResult> results) {
    if ((mBundle) == null) {
        return ;
    }
    java.util.Map<java.lang.String, android.net.wifi.ScanResult> currentWifiData = mBundle.getWifiData();
    for (android.net.wifi.ScanResult result : results) {
        if ((currentWifiData.size()) >= (org.mozilla.mozstumbler.service.stumblerthread.Reporter.MAX_WIFIS_PER_LOCATION)) {
            org.mozilla.mozstumbler.service.AppGlobals.guiLogInfo("Max wifi limit exceeded for this location, ignoring data.");
            return ;
        }
        java.lang.String key = result.BSSID;
        if (!(currentWifiData.containsKey(key))) {
            currentWifiData.put(key, result);
        }
    }
}