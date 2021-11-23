protected boolean isPositionAvailable(chess.Board board, java.lang.String position) {
    int x = (position.charAt(0)) - 'a';
    int y = 8 - (java.lang.Character.getNumericValue(position.charAt(1)));
    if ((x < 0) || (x > 7))
        return false;
    
    if ((y < 0) || (y > 7))
        return false;
    
    if (this.checkSameTeam(board.findPiece(position)))
        return false;
    
    return true;
}