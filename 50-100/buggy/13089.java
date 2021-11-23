@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mCurrentLocation = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    mLastUpdateTime = java.text.DateFormat.getTimeInstance().format(new java.util.Date());
    com.frodo.travigator.utils.CommonUtils.logStatus(TAG, ((("Location updated ->" + (location.getLatitude())) + ":") + (location.getLongitude())));
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.frodo.travigator.events.LocationChangedEvent(mCurrentLocation));
    stopLocationUpdates();
}