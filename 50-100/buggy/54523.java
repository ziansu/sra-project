public static org.osmdroid.mapsforge.MapsForgeTileSource createFromFiles(java.io.File[] file, org.mapsforge.map.rendertheme.XmlRenderTheme theme, java.lang.String themeName) {
    int minZoomLevel = org.osmdroid.mapsforge.MapsForgeTileSource.MIN_ZOOM;
    int maxZoomLevel = org.osmdroid.mapsforge.MapsForgeTileSource.MAX_ZOOM;
    int tileSizePixels = org.osmdroid.mapsforge.MapsForgeTileSource.TILE_SIZE_PIXELS;
    return new org.osmdroid.mapsforge.MapsForgeTileSource(themeName, minZoomLevel, maxZoomLevel, tileSizePixels, file, theme, MultiMapDataStore.DataPolicy.RETURN_ALL);
}