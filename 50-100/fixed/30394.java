public void setVal(hexagonal_scrabble.Tile tile) {
    int oldX;
    int oldY;
    if ((t) != null) {
        oldX = t.getX();
        oldY = t.getY();
    }else {
        oldX = this.getX();
        oldY = this.getY();
    }
    t = new hexagonal_scrabble.Tile(oldX, oldY, tile.getVal(), 0);
    t.setSelected(tile.getSelected());
}