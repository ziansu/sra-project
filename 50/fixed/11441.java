public static void updatePilot(@android.support.annotation.NonNull
com.airmap.airmapsdk.models.pilot.AirMapPilot pilot, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.pilot.AirMapPilot> callback) {
    if (pilot != null) {
        com.airmap.airmapsdk.networking.services.PilotService.updatePilot(pilot, callback);
    }
}