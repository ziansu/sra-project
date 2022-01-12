@java.lang.Override
public void run() {
    while (true) {
        android.net.wifi.WifiInfo info = wifiManager.getConnectionInfo();
        java.lang.String wifiId = (info != null) ? info.getSSID() : null;
        if ((wifiId != null) && (wifiId.contains(UrlUtils.HOTPOT_NAME))) {
            mHanlder.sendEmptyMessage(0);
            wStatus = com.jbl.browser.activity.WIFIService.WIFIStatus.CONNECTED;
            wifiThread = null;
            return ;
        }
        try {
            java.lang.Thread.sleep(1000L);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}