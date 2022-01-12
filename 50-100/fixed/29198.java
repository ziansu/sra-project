@java.lang.Override
public void onLocationResult(com.google.android.gms.location.LocationResult result) {
    final android.location.Location androidLocation = result.getLastLocation();
    if (androidLocation == null)
        return ;
    
    android.location.org.droidplanner.services.android.impl.core.gcs.location.Location gcsLocation = locationRelay.toGcsLocation(androidLocation);
    if (gcsLocation == null)
        return ;
    
    timber.log.Timber.d(("Location Lat/Long: " + (org.droidplanner.services.android.impl.core.gcs.follow.LocationRelay.getLatLongFromLocation(androidLocation))));
    notifyLocationUpdate(gcsLocation);
}