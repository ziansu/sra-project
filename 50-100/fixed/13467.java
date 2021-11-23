private boolean isLocationVisible(net.osmand.data.RotatedTileBox tb, double latitude, double longitude) {
    if (((this.getDestinationPoint()) == null) || ((mapTileView) == null)) {
        return false;
    }
    return tb.containsLatLon(latitude, longitude);
}