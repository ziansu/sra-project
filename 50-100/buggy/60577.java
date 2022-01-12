public boolean checkForTie() {
    boolean tie = true;
    for (int y = 0; y < (board.BOARD_Y); y++) {
        if ((board.whoControls(((board.BOARD_X) - 1), y)) == (Field.Control.NONE)) {
            tie = false;
        }
    }
    return tie;
}