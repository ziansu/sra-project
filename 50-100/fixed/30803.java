void loadGeofences() {
    java.util.Iterator<com.ibm.pi.geofence.PIGeofence> it = com.ibm.pi.geofence.PIGeofence.findAll(com.ibm.pi.geofence.PIGeofence.class);
    if (((httpService.getServerURL()) != null) && (!(it.hasNext()))) {
        com.ibm.pi.geofence.PIGeofencingService.log.debug("loadGeofences() loading geofences from the server");
        loadGeofencesFromServer();
    }else {
        com.ibm.pi.geofence.PIGeofencingService.log.debug("loadGeofences() found geofences in local database");
        setInitialLocation();
    }
}