@java.lang.Override
public void mapTileRequestCompleted(final com.mapbox.mapboxsdk.tileprovider.MapTileRequestState aState, final android.graphics.drawable.Drawable aDrawable) {
    try {
        mLockWorkingTiles.writeLock().lock();
        mWorking.remove(aState.getMapTile());
    } finally {
        mLockWorkingTiles.writeLock().unlock();
    }
    super.mapTileRequestCompleted(aState, aDrawable);
}