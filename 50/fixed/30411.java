private android.content.Intent GetBatteryStatusIntent() {
    android.content.IntentFilter ifilter = new android.content.IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED);
    return context.registerReceiver(null, ifilter);
}