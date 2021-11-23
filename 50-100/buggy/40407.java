private void setMines() {
    for (int i = 0; i < (this.mines); i++) {
        int randX;
        int randY;
        do {
            randX = randomInt(((sizeX) + 1));
            randY = randomInt(((sizeY) + 1));
        } while (getCell(randX, randY).isMine() );
        field[randX][randY] = new minesweeper.Mine();
    }
}