@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.d(com.abrahamyans.gpsbusfeed.scheduler.LocationService.TAG, ("Changed location " + location));
    com.abrahamyans.gpsbusfeed.event.LocationChangedEvent event = new com.abrahamyans.gpsbusfeed.event.LocationChangedEvent(getApplicationContext(), location, new java.util.Date());
    if (tracker.isValidLocationEvent(event)) {
        feed.onLocationChanged(new com.abrahamyans.gpsbusfeed.event.LocationChangedEvent(getApplicationContext(), location, new java.util.Date()));
    }
    processingLocation = false;
    disconnect();
}