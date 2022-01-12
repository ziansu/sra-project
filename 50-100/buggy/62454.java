@java.lang.SuppressWarnings(value = "unchecked")
private java.lang.String getGeofenceTransitionDetails(int geofenceTransition, java.util.List<com.google.android.gms.location.Geofence> triggeringGeofences) {
    java.lang.String geofenceTransitionString = getTransitionString(geofenceTransition);
    java.util.ArrayList triggeringGeofencesIdsList = new java.util.ArrayList();
    for (com.google.android.gms.location.Geofence geofence : triggeringGeofences) {
        triggeringGeofencesIdsList.add(geofence.getRequestId());
    }
    java.lang.String triggeringGeofencesIdsString = android.text.TextUtils.join(", ", triggeringGeofencesIdsList);
    return (geofenceTransitionString + ": ") + triggeringGeofencesIdsString;
}