@java.lang.Override
protected void onPause() {
    super.onPause();
    android.util.Log.i("Map - pause", "Map activity paused, location updates stopped");
    if (isSetup)
        stopLocationUpdates();
    
}