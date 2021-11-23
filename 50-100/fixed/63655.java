void onSaveInstanceState(android.os.Bundle outState) {
    outState.putInt(MapboxConstants.STATE_MY_LOCATION_TRACKING_MODE, getMyLocationTrackingMode());
    outState.putInt(MapboxConstants.STATE_MY_BEARING_TRACKING_MODE, getMyBearingTrackingMode());
    outState.putBoolean(MapboxConstants.STATE_MY_LOCATION_TRACKING_DISMISS, isDismissLocationTrackingOnGesture());
    outState.putBoolean(MapboxConstants.STATE_MY_BEARING_TRACKING_DISMISS, isDismissBearingTrackingOnGesture());
    outState.putBoolean(MapboxConstants.STATE_MY_LOCATION_ENABLED, isMyLocationEnabled());
}