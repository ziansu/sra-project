private void placeBombs(final int bombs) {
    java.util.Random r = new java.util.Random();
    int numPlaced = 0;
    int y;
    int x;
    while (numPlaced < bombs) {
        y = r.nextInt(boardHeight);
        x = r.nextInt(boardWidth);
        if (!(getCell(x, y).isBomb())) {
            getCell(x, y).setBomb(true);
            numPlaced++;
        }
    } 
    setBombCounts();
}