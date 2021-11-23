public static void submit(java.lang.String key, org.openstreetmap.josm.plugins.mapillary.cache.MapillaryCache.Type type, org.openstreetmap.josm.data.cache.ICachedLoaderListener lis) {
    new org.openstreetmap.josm.plugins.mapillary.cache.MapillaryCache(key, type).submit(lis, false);
}