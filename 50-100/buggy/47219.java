public void markFix() {
    for (int r = 0; r < (com.example.yabinc.sudogame.GameModel.BOARD_ROWS); ++r) {
        for (int c = 0; c < (com.example.yabinc.sudogame.GameModel.BOARD_COLS); ++c) {
            if ((mBoard[r][c].isUserInput) && (mBoard[r][c].isFilled)) {
                if (!(mBoard[r][c].isConflictWithOthers)) {
                    mBoard[r][c].isFixed = true;
                }
            }
        }
    }
}