public void setZoom(int zoom) {
    if ((this.zoom) == zoom)
        return ;
    
    int oldZoom = this.zoom;
    int[] oldTileXy = this.currentCenterTileXy;
    this.zoom = zoom;
    updateTilesPosition();
    clearTiles();
    downloadTiles();
    rescaleCurrentBitmap(oldZoom, oldTileXy);
}