@java.lang.Override
public void updatePosition() {
    sau.Tile[][] tiles = map.getTileArray();
    updatePreviousPosition(tiles);
    updateCurrentPosition(tiles);
    calculateXY();
}