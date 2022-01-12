@java.lang.SuppressWarnings(value = "unchecked")
private java.lang.String getGeofenceTransitionDetails(java.util.List<com.google.android.gms.location.Geofence> triggeringGeofences) {
    java.util.ArrayList triggeringGeofencesIdsList = new java.util.ArrayList();
    for (com.google.android.gms.location.Geofence geofence : triggeringGeofences) {
        triggeringGeofencesIdsList.add(geofence.getRequestId());
    }
    return android.text.TextUtils.join(", ", triggeringGeofencesIdsList);
}