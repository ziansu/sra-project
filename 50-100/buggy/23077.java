@java.lang.Override
public model.BoardLocation makeMove() throws exceptions.InvalidIndexException {
    model.BoardLocation nextMove = null;
    if ((board.getTotalStones()) < 10)
        nextMove = solver.makeMoveBeginning();
    else
        nextMove = solver.makeMoveEnd();
    
    lastMove = nextMove;
    java.lang.System.out.format("AI: I got (%d, %d) for this move.\n", nextMove.getXPos(), nextMove.getYPos());
    return nextMove;
}