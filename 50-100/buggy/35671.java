public static org.osmdroid.mapsforge.MapsForgeTileSource createFromFiles(java.io.File[] file) {
    int minZoomLevel = org.osmdroid.mapsforge.MapsForgeTileSource.MIN_ZOOM;
    int maxZoomLevel = org.osmdroid.mapsforge.MapsForgeTileSource.MAX_ZOOM;
    int tileSizePixels = org.osmdroid.mapsforge.MapsForgeTileSource.TILE_SIZE_PIXELS;
    return new org.osmdroid.mapsforge.MapsForgeTileSource(InternalRenderTheme.OSMARENDER.name(), minZoomLevel, maxZoomLevel, tileSizePixels, file, org.mapsforge.map.rendertheme.InternalRenderTheme.OSMARENDER, MultiMapDataStore.DataPolicy.RETURN_ALL);
}