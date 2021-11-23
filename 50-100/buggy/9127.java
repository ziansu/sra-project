protected int newGame(int _difficulty) {
    logger.logDebugMessage("Inside newGame().");
    difficulty = _difficulty;
    timeElapsed = "00:00";
    if (((difficulty) < 1) || ((difficulty) > 3)) {
        difficulty = (randGen.nextInt(3)) + 1;
    }
    buildCompleteBoard();
    digHoles(getNumberOfGivens(difficulty));
    checkBounds(getBound(difficulty));
    markOriginals();
    return difficulty;
}