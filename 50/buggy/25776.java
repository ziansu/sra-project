@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((provider) != null) {
        locationManager.requestLocationUpdates(provider, 1000, 0, this);
    }
}