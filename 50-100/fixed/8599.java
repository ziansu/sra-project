public boolean isCurrentLocationValid() {
    for (org.lwjgl.util.Point point : currentPiece.getPoints()) {
        if (((((point.getX()) > (board[0].length)) || ((point.getY()) > (board.length))) || ((point.getX()) < 0)) || ((point.getY()) < 0))
            return false;
        
    }
    return true;
}