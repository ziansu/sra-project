private java.lang.String getGeofenceTrasitionDetails(int geoFenceTransition, java.util.List<com.google.android.gms.location.Geofence> triggeringGeofences) {
    java.util.ArrayList<java.lang.String> triggeringGeofencesList = new java.util.ArrayList<>();
    for (com.google.android.gms.location.Geofence geofence : triggeringGeofences) {
        triggeringGeofencesList.add(geofence.getRequestId());
    }
    return android.text.TextUtils.join(", ", triggeringGeofencesList);
}