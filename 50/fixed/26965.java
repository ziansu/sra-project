public static void getPermit(@android.support.annotation.NonNull
java.lang.String permitId, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.util.List<com.airmap.airmapsdk.models.permits.AirMapAvailablePermit>> callback) {
    if (permitId != null) {
        com.airmap.airmapsdk.networking.services.AirMap.getPermits(permitId, null, callback);
    }
}