private int[] gameOver(edu.frostburg.cosc591_connectx.Board board, boolean turn) {
    if ((board.isGameOver()) && (!turn)) {
        return new int[]{ (maxDepth) + 1 , -1 };
    }else
        if ((board.isGameOver()) && turn) {
            return new int[]{ -((maxDepth) + 1) , -1 };
        }
    
    return new int[]{ 0 , -1 };
}