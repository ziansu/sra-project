public static void applyForPermit(@android.support.annotation.NonNull
com.airmap.airmapsdk.models.permits.AirMapAvailablePermit permit, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.permits.AirMapPilotPermit> callback) {
    if (permit != null) {
        com.airmap.airmapsdk.networking.services.PermitService.applyForPermit(permit, callback);
    }
}