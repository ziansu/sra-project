public long getLocationSetPeriod() {
    final android.content.SharedPreferences prefs = getSharedPreferences(ListFragment.SHARED_PREFS, 0);
    long setPeriod = prefs.getLong(ListFragment.GPS_SCAN_PERIOD, net.wigle.wigleandroid.MainActivity.LOCATION_UPDATE_INTERVAL);
    if (setPeriod == 0) {
        setPeriod = java.lang.Math.max(state.wifiReceiver.getScanPeriod(), net.wigle.wigleandroid.MainActivity.LOCATION_UPDATE_INTERVAL);
    }
    return setPeriod;
}