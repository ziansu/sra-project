public android.location.Location getLastLocation() {
    if ((lastLocation) == null)
        android.util.Log.d(com.example.singi_000.prototype1.GPSHandler.TAG, "GETLASTLOC IS NULL");
    
    return (lastLocation) == null ? null : new android.location.Location(lastLocation);
}