public static void getFlights(@android.support.annotation.NonNull
com.airmap.airmapsdk.models.pilot.AirMapPilot pilot, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.util.List<com.airmap.airmapsdk.models.flight.AirMapFlight>> callback) {
    if (pilot != null) {
        com.airmap.airmapsdk.networking.services.FlightService.getFlights(null, pilot.getPilotId(), null, null, null, null, null, null, null, null, null, null, null, true, callback);
    }
}