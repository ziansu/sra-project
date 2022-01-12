public int[] getPixelOfTileContaining(int xPixel, int yPixel) {
    int[] tile = getTilePosition(xPixel, yPixel);
    return getBottomLeftPixelOfTile(tile[0], tile[1]);
}