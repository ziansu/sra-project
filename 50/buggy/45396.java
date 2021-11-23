@java.lang.Override
public void executeMoves(java.util.ArrayList<com.tdt4240.RawHeroes.event.move.Move> lastMoves) {
    if (lastMoves == null)
        return ;
    
    for (com.tdt4240.RawHeroes.event.move.Move move : lastMoves) {
        doMove(move);
    }
    initialBoard = board.deepCopy();
}