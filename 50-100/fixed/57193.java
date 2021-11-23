@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    android.util.Log.d(org.omnirom.omnijaws.WeatherLocationListener.TAG, "The location service has become available, schedule an update ");
    if (status == (android.location.LocationProvider.AVAILABLE)) {
        synchronized(org.omnirom.omnijaws.WeatherLocationListener.class) {
            org.omnirom.omnijaws.WeatherService.startUpdate(mContext);
            cancelTimeoutAlarm();
            org.omnirom.omnijaws.WeatherLocationListener.sInstance = null;
        }
    }
}