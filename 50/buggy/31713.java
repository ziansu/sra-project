public void clearGame() {
    p1.restoreGuessToDefault();
    p2.restoreGuessToDefault();
    p1.restoreCodeToDefault();
    p2.restoreCodeToDefault();
    gameScore = 0;
    currentRound = 0;
}