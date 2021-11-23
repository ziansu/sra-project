private void revealBoard() {
    for (int y = 0; y < (boardHeight); y++) {
        for (int x = 0; x < (boardWidth); x++) {
            getCell(x, y).setRevealed(true);
        }
    }
}