public void setOnLocationAndSpeedListener(com.shlomicko.monit.services.gps.OnLocationAndSpeedListener listener) {
    _listener = listener;
    android.util.Log.d(TAG, ("listener is:" + (_listener)));
    _locAndSpeedManager = new com.shlomicko.monit.services.gps.LocationAndSpeedManager(((android.app.Activity) (_listener)));
    _locAndSpeedManager.setGPSUpdate(this);
}