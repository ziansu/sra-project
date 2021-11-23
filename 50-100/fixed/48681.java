public void makeMove() {
    if (board.getGameover()) {
        throw new java.lang.RuntimeException();
    }
    long timer = java.lang.System.currentTimeMillis();
    while (((java.lang.System.currentTimeMillis()) - timer) < (timeLimit)) {
        root.trial(board.deepCopy());
    } 
    chosenChild = root.maxNode();
    chosenChild.applyMove(board);
}