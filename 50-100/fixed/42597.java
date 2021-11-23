@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    if (requestCode == (com.transitangel.transitangel.Manager.GeofenceManager.GEOFENCE_GET_FINE_LOC_REQ_CODE)) {
        if (((selectedStop) != null) && ((selectedTrip) != null)) {
            addGeoFenceToSelectedStops(selectedTrip);
        }
    }
}