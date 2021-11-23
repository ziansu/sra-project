@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.e(arfler.erider.RiderHomeActivity.TAG, ((("Location Changed : " + (location.getLatitude())) + ", ") + (location.getLongitude())));
    mLocation = location;
    updateCurrentMarker(new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude()));
}