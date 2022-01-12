@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.e(arfler.erider.RiderHomeActivity.TAG, ((("Location Changed : " + (location.getLatitude())) + ", ") + (location.getLongitude())));
    mLocation = location;
    locationLabel.setText(java.lang.String.format(getResources().getString(R.string.lat_lng), location.getLatitude(), location.getLongitude()));
    updateCurrentMarker(new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude()));
}