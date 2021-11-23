private org.osmdroid.tileprovider.tilesource.bing.imagerymetadata.ImageryMetaDataResource initMetaData() {
    if (!(mImageryData.m_isInitialised)) {
        synchronized(this) {
            if (!(mImageryData.m_isInitialised)) {
                final org.osmdroid.tileprovider.tilesource.bing.imagerymetadata.ImageryMetaDataResource imageryData = getMetaData();
                if (imageryData != null) {
                    mImageryData = imageryData;
                    microsoft.mappoint.TileSystem.setTileSize(getTileSizePixels());
                    updateBaseUrl();
                }
            }
        }
    }
    return mImageryData;
}