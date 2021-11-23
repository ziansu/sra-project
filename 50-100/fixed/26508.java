public void setPlayersPilesIndexes(int bottomPlayerPileIndex, int topRightPlayerPileIndex, int topLeftPlayerPileIndex) {
    mBottomPlayerPile.setPileIndex(bottomPlayerPileIndex);
    mTopRightPlayerPile.setPileIndex(topRightPlayerPileIndex);
    mTopLeftPlayerPile.setPileIndex(topLeftPlayerPileIndex);
    this.mIndexToPileMap.put(bottomPlayerPileIndex, mBottomPlayerPile);
    this.mIndexToPileMap.put(topRightPlayerPileIndex, mTopRightPlayerPile);
    this.mIndexToPileMap.put(topLeftPlayerPileIndex, mTopLeftPlayerPile);
}