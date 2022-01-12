void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    try {
        setMyLocationEnabled(savedInstanceState.getBoolean(MapboxConstants.STATE_MY_LOCATION_ENABLED));
    } catch (java.lang.SecurityException ignore) {
    }
    setMyLocationTrackingMode(savedInstanceState.getInt(MapboxConstants.STATE_MY_LOCATION_TRACKING_MODE, MyLocationTracking.TRACKING_NONE));
    setMyBearingTrackingMode(savedInstanceState.getInt(MapboxConstants.STATE_MY_BEARING_TRACKING_MODE, MyBearingTracking.NONE));
    setDismissLocationTrackingOnGesture(savedInstanceState.getBoolean(MapboxConstants.STATE_MY_LOCATION_TRACKING_DISMISS, true));
    setDismissBearingTrackingOnGesture(savedInstanceState.getBoolean(MapboxConstants.STATE_MY_BEARING_TRACKING_DISMISS, true));
    setDismissTrackingModeForCameraPositionChange(savedInstanceState.getBoolean(MapboxConstants.STATE_MY_TRACKING_MODE_DISMISS_FOR_CAMERA, true));
}