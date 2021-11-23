public void onDrop(org.mapsforge.core.model.LatLong latLong) {
    int index = this.positionsModel.getIndex(positionWithLayer.getPosition());
    if (index == (-1)) {
        slash.navigation.mapview.mapsforge.MapsforgeMapView.log.warning(("Marker without position " + (this)));
        return ;
    }
    this.positionsModel.edit(index, new slash.navigation.mapview.mapsforge.PositionColumnValues(java.util.Arrays.asList(slash.navigation.mapview.mapsforge.LONGITUDE_COLUMN_INDEX, slash.navigation.mapview.mapsforge.LATITUDE_COLUMN_INDEX), java.util.Arrays.<java.lang.Object>asList(latLong.longitude, latLong.latitude)), true, true);
}