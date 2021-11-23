@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    }
    if ((mMap) == null)
        return ;
    
    if ((mLastLocation) == null)
        android.util.Log.e(com.example.andi.hikemap.MapsActivity.TAG, "1mLastLocation is null");
    
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(mLastLocation.getLatitude(), mLastLocation.getLongitude());
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(latLng));
}