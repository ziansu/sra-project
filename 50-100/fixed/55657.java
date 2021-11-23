private void placeBombs(final int bombs) {
    java.util.Random r = new java.util.Random();
    int numPlaced = 0;
    int y;
    int x;
    while (numPlaced < bombs) {
        y = r.nextInt(boardHeight);
        x = r.nextInt(boardWidth);
        if (!(getCell(y, x).isBomb())) {
            getCell(y, x).setBomb(true);
            numPlaced++;
        }
    } 
    setBombCounts();
}