public void initialize(int viewCols, int viewRows, WorldModel world, int tileWidth, int tileHeight) {
    this.viewCols = viewCols;
    this.viewRows = viewRows;
    this.world = world;
    this.tileWidth = tileWidth;
    this.tileHeight = tileHeight;
    this.viewport = new Rectangle(0, 0, viewCols, viewRows);
    this.numRows = world.getWidth();
    this.numCols = world.getHeight();
}