public void setVal(hexagonal_scrabble.Tile tile) {
    int oldX = this.getX();
    int oldY = this.getY();
    t = new hexagonal_scrabble.Tile(oldX, oldY, tile.getVal(), 0);
    t.setSelected(tile.getSelected());
}