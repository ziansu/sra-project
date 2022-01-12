private void setMapStyle(int style) {
    try {
        boolean success = mMap.setMapStyle(com.google.android.gms.maps.model.MapStyleOptions.loadRawResourceStyle(this, style));
        if (!success) {
            android.util.Log.e(com.task.vasskob.googlemapsrealm.MapsActivity.TAG, "Style parsing failed.");
        }
    } catch (android.content.res.Resources e) {
        android.util.Log.e(com.task.vasskob.googlemapsrealm.MapsActivity.TAG, "Can't find style. Error: ", e);
    }
}