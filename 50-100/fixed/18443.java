public void updateAllTiles() {
    wholeBoard.updateDrawableState();
    for (int large = 0; large < 9; large++) {
        largeTiles[large].updateDrawableState();
        for (int small = 0; small < 9; small++) {
            smallTiles[large][small].updateDrawableState();
        }
    }
}