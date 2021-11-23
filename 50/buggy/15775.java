public static void chooseBeautifulMapProvider(android.content.Context context, org.osmdroid.views.MapView map) {
    org.osmdroid.tileprovider.tilesource.MapBoxTileSource tileSource = new org.osmdroid.tileprovider.tilesource.MapBoxTileSource(context);
    map.setTilesScaledToDpi(true);
    map.setMaxZoomLevel(17);
    tileSource.setMapboxMapid("mapbox.emerald");
    map.setTileSource(tileSource);
}