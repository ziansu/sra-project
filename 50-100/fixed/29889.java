@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    double lat = location.getLatitude();
    double lon = location.getLongitude();
    float bearing = location.getBearing();
    if ((appListener) != null)
        appListener.onGpsChanged(lat, lon, bearing);
    
    if (naviMode)
        navigate(lat, lon);
    
}