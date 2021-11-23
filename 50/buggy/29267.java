@java.lang.Override
public void updatePosition() {
    sau.Tile[][] tiles = map.getTileArray();
    updateCurrentPosition(tiles);
    updatePreviousPosition(tiles);
    calculateXY();
}