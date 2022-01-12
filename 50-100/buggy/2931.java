private void initializeLocation() {
    android.util.Log.e(com.mtxb2b.maverickai.BackgroundService.TAG, "initializeLocationManager");
    if ((mLocationManager) == null) {
        mLocationManager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
        mListener = new com.mtxb2b.maverickai.UserLocationListener(this);
    }
    try {
        mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, com.mtxb2b.maverickai.BackgroundService.UpdateFreqTime, com.mtxb2b.maverickai.BackgroundService.UpdateFreqDist, mListener);
    } catch (java.lang.SecurityException e) {
        android.util.Log.d(com.mtxb2b.maverickai.BackgroundService.TAG, e.getMessage());
    }
}