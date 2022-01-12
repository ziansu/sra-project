public void onLocationChanged(android.location.Location location) {
    if (location != null) {
        locationChanged(location.getLatitude(), location.getLongitude());
        if ((location.hasAccuracy()) && ((location.getAccuracy()) < (com.ushahidi.android.app.MapUserLocation.ACCURACY_THRESHOLD))) {
            stopLocating();
        }
    }
}