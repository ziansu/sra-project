public void setPlayersPilesIndexes(int bottomPlayerPileIndex, int topRightPlayerPileIndex, int topLeftPlayerPileIndex) {
    mBottomPlayerPile.setPileIndex(bottomPlayerPileIndex);
    mTopRightPlayerPile.setPileIndex(topRightPlayerPileIndex);
    mTopLeftPlayerPile.setPileIndex(topLeftPlayerPileIndex);
    this.mIndexToPileMap.put(bottomPlayerPileIndex, mBottomPlayerPile);
    this.mIndexToPileMap.put((topRightPlayerPileIndex + 1), mTopRightPlayerPile);
    this.mIndexToPileMap.put((topLeftPlayerPileIndex + 2), mTopLeftPlayerPile);
}