public static void startComm(@android.support.annotation.NonNull
com.airmap.airmapsdk.models.flight.AirMapFlight flight, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.comm.AirMapComm> callback) {
    if (flight != null) {
        com.airmap.airmapsdk.networking.services.FlightService.getCommKey(flight, callback);
    }
}