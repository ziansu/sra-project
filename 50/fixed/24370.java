@java.lang.Override
protected void onPause() {
    super.onPause();
    if (isSetup)
        stopLocationUpdates();
    
}