static synchronized void onScanStatus(int status) {
    android.util.Log.i(com.android.server.wifi.WifiNative.TAG, ("Got a scan status changed event, status = " + status));
    if (status == (com.android.server.wifi.WifiNative.WIFI_SCAN_BUFFER_FULL)) {
    }else
        if (status == (com.android.server.wifi.WifiNative.WIFI_SCAN_COMPLETE)) {
            if ((com.android.server.wifi.WifiNative.sScanEventHandler) != null) {
                com.android.server.wifi.WifiNative.sScanEventHandler.onScanStatus();
            }
        }
    
}