private java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate> findUpdatesForTrip(java.util.Map<java.lang.String, java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate>> tripUpdatesByTripId, org.onebusaway.gtfs.model.AgencyAndId tripId) {
    if (_stripAgencyPrefix) {
        for (java.lang.String s : _agencyIds) {
            java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate> updates = tripUpdatesByTripId.get(((s + "_") + (tripId.getId())));
            if (updates != null) {
                return updates;
            }
        }
        return null;
    }
    return tripUpdatesByTripId.get(tripId.getId());
}