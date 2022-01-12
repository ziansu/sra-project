@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    refreshIntervalInMinutes = com.roman.romcontrol.util.WeatherPrefs.getRefreshInterval(mContext);
    if ((intent.getAction()) != null) {
        if (intent.getAction().equals(WeatherService.INTENT_REQUEST_WEATHER)) {
            android.content.Intent i = new android.content.Intent(getApplicationContext(), com.roman.romcontrol.service.WeatherService.class);
            i.setAction(WeatherService.INTENT_REQUEST_WEATHER);
            getApplicationContext().startService(i);
        }
    }
    scheduleRefresh();
    return START_STICKY;
}