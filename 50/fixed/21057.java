public void updateWifiEnabled(int state) {
    switch (state) {
        case android.net.wifi.WifiManager.WIFI_STATE_DISABLED :
            mHandler.sendEmptyMessage(com.android.systemui.statusbar.notificationbars.WifiDialog.WIFI_UNABLE);
            break;
        case android.net.wifi.WifiManager.WIFI_STATE_ENABLED :
            mHandler.sendEmptyMessage(com.android.systemui.statusbar.notificationbars.WifiDialog.WIFI_ENABLE);
            break;
        default :
            break;
    }
}