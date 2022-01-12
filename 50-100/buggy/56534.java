private boolean checkWin() {
    Player white = getWhitePlayer();
    Player black = getBlackPlayer();
    if ((whiteTurn) && (white.getKing().isInCheck(board, getBlackPlayer())))
        return checkMate(white, black);
    else
        if ((!(whiteTurn)) && (black.getKing().isInCheck(board, getWhitePlayer())))
            return checkMate(black, white);
        
    
}