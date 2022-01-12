public boolean checkForTie() {
    boolean tie = true;
    for (int y = 0; y < (board.BOARD_Y); y++) {
        if ((board.whoControls(0, y)) == (Field.Control.NONE)) {
            tie = false;
        }
    }
    return tie;
}