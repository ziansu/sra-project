private void onGeofencesFailed(java.lang.SecurityException ex, int status) {
    updating = false;
    if (ex != null) {
        Logger.log.geofenceError(("Failed to add geofences, error code: " + status), ex);
    }else {
        Logger.log.geofenceError(("Failed to add geofences, error code: " + status), ex);
    }
}