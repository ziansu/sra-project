public void selectLocation(amai.org.conventions.model.MapLocation location) {
    if ((floorMarkers) != null) {
        for (amai.org.conventions.map.Marker marker : floorMarkers) {
            if ((marker.getLocation().getId()) == (location.getId())) {
                marker.select(false);
                break;
            }
        }
    }else {
        locationToSelect = location;
    }
}