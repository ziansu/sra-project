private void addHeatMap(com.google.android.gms.maps.GoogleMap map) {
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> list = mydb.getAllPoints();
    com.google.maps.android.heatmaps.HeatmapTileProvider mProvider = new com.google.maps.android.heatmaps.HeatmapTileProvider.Builder().data(list).build();
    com.google.android.gms.maps.model.TileOverlay mOverlay = map.addTileOverlay(new com.google.android.gms.maps.model.TileOverlayOptions().tileProvider(mProvider));
}