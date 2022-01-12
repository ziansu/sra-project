@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    boolean gpsPresent = getPackageManager().hasSystemFeature(PackageManager.FEATURE_LOCATION_GPS);
    if (!gpsPresent) {
    }
    com.google.android.gms.location.LocationRequest locationRequest = com.google.android.gms.location.LocationRequest.create();
    locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    locationRequest.setInterval(2000);
    locationRequest.setFastestInterval(2000);
    locationRequest.setSmallestDisplacement(2);
    LocationServices.FusedLocationApi.requestLocationUpdates(googleClient, locationRequest, this);
    onLocationChanged(LocationServices.FusedLocationApi.getLastLocation(googleClient));
}