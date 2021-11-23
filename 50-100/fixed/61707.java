public com.joanzapata.tilesview.internal.Tile becomeMRU(com.joanzapata.tilesview.internal.Tile lastMRU) {
    if ((newerTile) != null)
        newerTile.olderTile = olderTile;
    
    if ((olderTile) != null)
        olderTile.newerTile = newerTile;
    
    newerTile = null;
    if (lastMRU != (this)) {
        olderTile = lastMRU;
        if (lastMRU != null)
            lastMRU.newerTile = this;
        
    }
    return this;
}