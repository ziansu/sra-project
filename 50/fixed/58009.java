@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((locationManager) != null)
        locationManager.removeUpdates(this);
    
}