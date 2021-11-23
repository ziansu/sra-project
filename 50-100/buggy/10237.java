public entities.Tile remove(entities.AbstractLevel level) {
    entities.Tile oldTile = this.tile;
    this.selected = false;
    if ((this.jIndex) == 0) {
        this.tile = new entities.Tile(5, 5);
    }else {
        this.tile = parentBoard.getSquare(iIndex, ((jIndex) - 1)).remove(level);
    }
    return oldTile;
}