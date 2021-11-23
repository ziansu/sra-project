protected void removeMovesThatCauseCheck(chess.model.ChessGame game, java.util.List<chess.model.Position> currLegalMoves) {
    java.util.Iterator iter = currLegalMoves.iterator();
    while (iter.hasNext()) {
        chess.model.Position move = ((chess.model.Position) (iter.next()));
        if (move == null)
            continue;
        
        if (game.moveCausesCheckForItsOwnKing(this.getPosition(), move))
            iter.remove();
        
    } 
}