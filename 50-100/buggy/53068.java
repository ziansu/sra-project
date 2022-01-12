@java.lang.Override
public final void detach() {
    super.detach();
    if ((getTileSource()) != null)
        getTileSource().detach();
    
    synchronized(mTileProviderList) {
        for (final com.mapbox.mapboxsdk.tileprovider.modules.MapTileModuleLayerBase tileProvider : mTileProviderList)
            tileProvider.detach();
        
    }
    mLockWorkingTiles.writeLock().lock();
    try {
        mWorking.clear();
    } finally {
        mLockWorkingTiles.writeLock().unlock();
    }
}