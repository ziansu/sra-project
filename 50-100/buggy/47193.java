@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    lastLocation = location;
    if ((org.redcross.openmapkit.LocationXMLParser.getProximityCheck()) == true) {
        if ((location.getAccuracy()) <= (org.redcross.openmapkit.LocationXMLParser.getGpsProximityAccuracy())) {
            if ((org.redcross.openmapkit.LocationXMLParser.isProximityEnabled()) == false) {
                if ((isUserLocationEnabled()) == false) {
                    toggleUserLocation();
                }
            }
            org.redcross.openmapkit.LocationXMLParser.setProximityEnabled(true);
        }
    }
}