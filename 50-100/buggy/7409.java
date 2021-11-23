public void run() {
    if ((mRequestingUpdates) == (mSharedPreferences.getBoolean(edu.cornell.jjl.info4120final.MainActivity.REQUESTING_LOCATION_UPDATES_KEY, false))) {
    }else {
        mRequestingUpdates = mSharedPreferences.getBoolean(edu.cornell.jjl.info4120final.MainActivity.REQUESTING_LOCATION_UPDATES_KEY, false);
        if ((mRequestingUpdates) && (mGoogleApiClient.isConnected())) {
            startLocationUpdates();
            mAccelLogger = new edu.cornell.jjl.info4120final.DataLogger("accel");
            mLocationLogger = new edu.cornell.jjl.info4120final.DataLogger("location");
            mActivityLogger = new edu.cornell.jjl.info4120final.DataLogger("activity_recognition");
        }else {
        }
    }
    handler.postDelayed(this, 1000);
}