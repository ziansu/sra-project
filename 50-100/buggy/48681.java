public void makeMove() {
    if (board.getGameover()) {
        throw new java.lang.RuntimeException();
    }
    int iters = 0;
    long timer = java.lang.System.currentTimeMillis();
    while (((java.lang.System.currentTimeMillis()) - timer) < (timeLimit)) {
        root.trial(board.deepCopy());
        iters++;
    } 
    java.lang.System.out.println(iters);
    chosenChild = root.maxNode();
    chosenChild.applyMove(board);
}