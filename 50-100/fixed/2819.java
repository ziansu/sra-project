private void checkRabbitReachWin(android.graphics.Point p, email.com.gmail.songjiapei.arimaa.Piece.PieceColour rabbitColour, email.com.gmail.songjiapei.arimaa.GameEngine.GameState winState) {
    if (!(isEmpty(p)))
        if (((board.getPiece(p).getType()) == (email.com.gmail.songjiapei.arimaa.Piece.PieceType.RABBIT)) && ((board.getPiece(p).getColour()) == rabbitColour))
            gameState = winState;
        
    
}