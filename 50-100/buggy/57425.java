private void disableAllActive() {
    if (gameOver)
        return ;
    
    checkForFullRow();
    for (int arX = 0; arX < (tiles.length); arX++) {
        for (int arY = 0; arY < (tiles[0].length); arY++) {
            if (tiles[arX][arY].active) {
                tiles[arX][arY].active = false;
            }
        }
    }
    addPiece();
}