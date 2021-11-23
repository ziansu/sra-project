protected boolean buildCompleteBoard() {
    try {
        logger.logDebugMessage("Inside buildCompleteBoard().");
        java.util.Stack<me.valesken.jeff.sudoku_model.Tile> tileStack = new java.util.Stack<>();
        seedFirstTiles(tileStack);
        fillBoard_DFS(tileStack);
        saveBoardToSolution();
        return true;
    } catch (java.util.EmptyStackException e) {
        return false;
    }
}