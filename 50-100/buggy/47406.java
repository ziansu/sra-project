public void addTaskToGeofenceList(de.unima.pc2016.taskloc.application.database.TaskDataObject tdo) {
    for (de.unima.pc2016.taskloc.application.database.LocationDataObject locationDataObject : tdo.getLocations()) {
        mGeofenceList.add(new com.google.android.gms.location.Geofence.Builder().setRequestId(java.lang.String.valueOf(tdo.getId())).setCircularRegion(locationDataObject.getLatitude(), locationDataObject.getLongitude(), tdo.getRange()).setExpirationDuration(Geofence.NEVER_EXPIRE).setTransitionTypes(Geofence.GEOFENCE_TRANSITION_ENTER).build());
    }
}