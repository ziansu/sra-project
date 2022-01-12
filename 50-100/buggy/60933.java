@java.lang.Override
public void executeMovesFromOtherPlayer(java.util.ArrayList<com.tdt4240.RawHeroes.event.move.Move> lastMoves) {
    if (lastMoves == null)
        return ;
    
    for (com.tdt4240.RawHeroes.event.move.Move move : lastMoves) {
        move.convertPositions(board.getWidth(), board.getHeight());
        doMove(move);
    }
    initialBoard = board.deepCopy();
}