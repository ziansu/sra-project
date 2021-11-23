@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.util.Log.d(k7i3.code.tnc.transport.activity.TAG, "onConnected()");
    LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, k7i3.code.tnc.transport.activity.BaseGoogleMapsActivity.REQUEST, this);
    location = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    if (isFirstConnect) {
        moveCamera(latLng);
        isFirstConnect = false;
    }
}