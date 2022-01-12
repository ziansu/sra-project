private org.springframework.data.geo.Point fillCoordinates(com.geolocation.search.model.Place place) {
    org.springframework.data.geo.Point coordinates;
    try {
        java.lang.Double[] latLong = geoApiHelper.getLatLong(place.getAddress().getAddress());
        coordinates = new org.springframework.data.geo.Point(latLong[1], latLong[0]);
    } catch (java.lang.Exception e) {
        throw new java.lang.IllegalArgumentException(("Could not find the coordinates to the address provided: " + (place.getAddress().getAddress())));
    }
    return coordinates;
}