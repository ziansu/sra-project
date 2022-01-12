public void onLocationChanged(android.location.Location location) {
    if ((prefs.getUserId()) == null)
        return ;
    
    android.util.Log.v(se.omegapoint.beaconmountain.service.LocationListener.TAG, ("Got accurate location: " + (location.getAccuracy())));
    if ((lastLocation) == null) {
        notifyLocationUpdate(location);
    }else {
        if ((location.distanceTo(lastLocation)) > (se.omegapoint.beaconmountain.service.LocationListener.MINIMAL_DISTANCE)) {
            notifyLocationUpdate(location);
        }
    }
    lastLocation = location;
}