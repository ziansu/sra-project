public void setCharacter(java.lang.Character c, int row, int col) {
    floor[row][col].setOccupant(c);
    c.setRow(row);
    c.setCol(col);
    if ((c instanceof artGame.game.Guard) && (!(guards.contains(((artGame.game.Guard) (c)))))) {
        guards.add(((artGame.game.Guard) (c)));
    }
}