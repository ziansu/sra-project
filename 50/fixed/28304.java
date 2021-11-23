public static org.folksource.model.Location getLocationById(java.lang.Integer location_id) {
    return org.folksource.util.LocationService.getLocations(location_id).get(0);
}