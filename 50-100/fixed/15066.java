private boolean catalogLayerNeedsUpdate(final android.location.Location current) {
    if (current == null) {
        return true;
    }
    return ((mCatalogRefreshLocation.distanceTo(current)) > (org.openbmap.activities.tabs.MapFragment.CATALOG_REFRESH_DISTANCE)) && (((java.lang.System.currentTimeMillis()) - (mCatalogLayerRefreshMillis)) > (org.openbmap.activities.tabs.MapFragment.CATALOG_REFRESH_INTERVAL));
}