@java.lang.Override
public boolean validate(com.conveyal.gtfs.GTFSFeed feed, boolean repair) {
    boolean isValid = true;
    for (com.conveyal.gtfs.model.Stop stop : feed.stops.values()) {
        com.vividsolutions.jts.geom.Coordinate stopCoord = new com.vividsolutions.jts.geom.Coordinate(stop.stop_lat, stop.stop_lon);
        com.conveyal.gtfs.validator.service.ProjectedCoordinate projectedStopCoord = null;
        try {
            projectedStopCoord = com.conveyal.gtfs.validator.service.GeoUtils.convertLatLonToEuclidean(stopCoord);
        } catch (java.lang.IllegalArgumentException iae) {
            feed.errors.add(new com.conveyal.gtfs.error.StopMissingCoordinatesError(stop.stop_id, stop));
            isValid = false;
        }
    }
    return isValid;
}