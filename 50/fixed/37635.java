public static void deleteFlight(@android.support.annotation.NonNull
com.airmap.airmapsdk.models.flight.AirMapFlight flight, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.lang.Void> callback) {
    if (flight != null) {
        com.airmap.airmapsdk.networking.services.FlightService.deleteFlight(flight, callback);
    }
}