public void onLocationChanged(pl.papistudio.localizer3000.Location location) {
    if (isNewLocationBetter(location)) {
        this.location = location;
        broadcastNewLocation(location);
        java.lang.System.reactToLocationChange(location, this.getApplicationContext(), this);
        android.util.Log.d(pl.papistudio.localizer3000.LocationService.TAG, "Location updated");
    }
    if ((location.getAccuracy()) > 150.0)
        reactToPoorLocationAccuracy();
    
}