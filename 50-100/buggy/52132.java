private void updateMarkers() {
    if ((map) == null) {
        return ;
    }
    if (isLocationPermissionGranted) {
        if (com.havrylyuk.elevation.BuildConfig.DEBUG)
            android.util.Log.d(com.havrylyuk.elevation.activity.MainActivity.LOG_TAG, "add Your Location Marker");
        
        addLocationMarker(currentLocation.getLatitude(), currentLocation.getLongitude());
    }else {
        if (com.havrylyuk.elevation.BuildConfig.DEBUG)
            android.util.Log.d(com.havrylyuk.elevation.activity.MainActivity.LOG_TAG, "add Developer Location Marker");
        
        addLocationMarker(defaultLocation.latitude, defaultLocation.longitude);
    }
}