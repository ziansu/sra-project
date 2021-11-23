private void myRegisterReceiver() {
    mVolumeReceiver = new com.android.systemui.statusbar.phone.PhoneStatusBar.MyVolumeReceiver();
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction(com.android.systemui.statusbar.phone.PhoneStatusBar.MEDIA_VOLUME_CHANGED);
    filter.addAction(Intent.ACTION_BATTERY_CHANGED);
    filter.addAction(WifiManager.WIFI_STATE_CHANGED_ACTION);
    filter.addAction(Intent.STATUS_BAR_WIFI_ICON);
    filter.addAction(Intent.STATUS_BAR_CHANGE_ICON);
    filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    mContext.registerReceiver(mVolumeReceiver, filter);
}