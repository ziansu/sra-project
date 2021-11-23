private java.util.List<uk.ac.ox.zoo.seeg.abraid.mp.common.domain.Location> filterToLocationsWithMatchingGeoNameId(java.util.List<uk.ac.ox.zoo.seeg.abraid.mp.common.domain.Location> locations, java.lang.Integer geoNameId) {
    java.util.List<uk.ac.ox.zoo.seeg.abraid.mp.common.domain.Location> locationsWithCorrectGeoNameId = new java.util.ArrayList<>();
    for (uk.ac.ox.zoo.seeg.abraid.mp.common.domain.Location location : locations) {
        if (geoNameId.equals(location.getGeoNameId())) {
            locationsWithCorrectGeoNameId.add(location);
        }
    }
    return locationsWithCorrectGeoNameId;
}