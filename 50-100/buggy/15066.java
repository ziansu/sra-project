private boolean catalogLayerNeedsUpdate(final android.location.Location current) {
    if (current == null) {
        return true;
    }
    boolean status = ((mCatalogRefreshLocation.distanceTo(current)) > (org.openbmap.activities.tabs.MapFragment.CATALOG_REFRESH_DISTANCE)) && (((java.lang.System.currentTimeMillis()) - (mCatalogLayerRefreshMillis)) > (org.openbmap.activities.tabs.MapFragment.CATALOG_REFRESH_INTERVAL));
    return status;
}