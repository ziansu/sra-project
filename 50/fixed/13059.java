static android.content.IntentFilter makeGattUpdateIntentFilter() {
    final android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(OsswService.ACTION_WATCH_CONNECTING);
    intentFilter.addAction(OsswService.ACTION_WATCH_CONNECTED);
    intentFilter.addAction(OsswService.ACTION_WATCH_DISCONNECTED);
    intentFilter.addAction(OsswService.ACTION_WATCH_AUTO_RECONNECT);
    return intentFilter;
}