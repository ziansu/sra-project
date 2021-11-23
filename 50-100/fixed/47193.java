@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    lastLocation = location;
    if (org.redcross.openmapkit.LocationXMLParser.getProximityCheck()) {
        if ((location.getAccuracy()) <= (org.redcross.openmapkit.LocationXMLParser.getGpsProximityAccuracy())) {
            if (!(org.redcross.openmapkit.LocationXMLParser.isProximityEnabled())) {
                if (!(isUserLocationEnabled())) {
                    toggleUserLocation();
                }
            }
            org.redcross.openmapkit.LocationXMLParser.setProximityEnabled(true);
        }
    }
}