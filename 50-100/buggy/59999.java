@java.lang.Override
public void clickMine(int pos) {
    int y = pos / (mGameState.getWidth());
    int x = pos % (mGameState.getWidth());
    mGameState.revealMine(y, x, new com.exercises.scott.minesweeper.GameState.ClickMineCallback() {
        @java.lang.Override
        public void onBoardUpdated() {
            mView.updateBoard();
        }

        @java.lang.Override
        public void onWin() {
        }
    }, true);
}