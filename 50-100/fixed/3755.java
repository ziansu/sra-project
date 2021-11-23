private static org.mapsforge.map.layer.cache.TileCache createTileCache(int index) {
    org.mapsforge.map.layer.cache.TileCache firstLevelTileCache = new org.mapsforge.map.layer.cache.InMemoryTileCache(128);
    java.io.File cacheDirectory = new java.io.File(java.lang.System.getProperty("java.io.tmpdir"), ("mapsforge" + index));
    org.mapsforge.map.layer.cache.TileCache secondLevelTileCache = new org.mapsforge.map.layer.cache.FileSystemTileCache(1024, cacheDirectory, org.mapsforge.map.swing.MapViewer.GRAPHIC_FACTORY);
    return new org.mapsforge.map.layer.cache.TwoLevelTileCache(firstLevelTileCache, secondLevelTileCache);
}