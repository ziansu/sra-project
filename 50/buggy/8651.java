public void reset() {
    map = new drtetris.Tile[getHeight()][getWidth()];
    state = drtetris.Field.NORMAL;
    fallingBlocks = new java.util.concurrent.CopyOnWriteArrayList<drtetris.MovingBlock>();
    checkBlocks = false;
}