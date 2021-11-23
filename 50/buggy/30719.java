private boolean isPositionEmpty(final Position pos) {
    GameTile[] blankTileArray = new GameTile[]{ GoldModel.BLANK_TILE };
    return (getGameboardState(pos)) == blankTileArray;
}