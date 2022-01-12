public be.willima.jrpgdatabase.model.JRPGTile getTile(int x, int y) throws java.lang.IndexOutOfBoundsException {
    be.willima.jrpgdatabase.model.JRPGTile tile = null;
    if ((((x < 0) || (x >= (this.width))) || (y < 0)) || (y >= (this.height))) {
        throw new java.lang.IndexOutOfBoundsException("Tile not within map region!");
    }else {
        tile = this.tiles[x][y];
    }
    return tile;
}