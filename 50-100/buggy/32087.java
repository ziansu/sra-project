private java.lang.String getGeofenceTrasitionDetails(int geoFenceTransition, java.util.List<com.google.android.gms.location.Geofence> triggeringGeofences) {
    java.util.ArrayList<java.lang.String> triggeringGeofencesList = new java.util.ArrayList<>();
    for (com.google.android.gms.location.Geofence geofence : triggeringGeofences) {
        triggeringGeofencesList.add(geofence.getRequestId());
    }
    java.lang.String status = null;
    if (geoFenceTransition == (com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_ENTER))
        status = "Entering ";
    else
        if (geoFenceTransition == (com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_EXIT))
            status = "Exiting ";
        
    
    return android.text.TextUtils.join(", ", triggeringGeofencesList);
}