@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    lastLocation = location;
    if (org.redcross.openmapkit.Settings.singleton().getProximityCheck()) {
        if ((location.getAccuracy()) <= (org.redcross.openmapkit.Settings.singleton().getGpsProximityAccuracy())) {
            if (!(org.redcross.openmapkit.Settings.singleton().isProximityEnabled())) {
                if (!(isUserLocationEnabled())) {
                    toggleUserLocation();
                }
            }
            org.redcross.openmapkit.Settings.singleton().setProximityEnabled(true);
        }
    }
}