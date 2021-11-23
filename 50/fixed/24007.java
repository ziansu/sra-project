private void removeChessPiece(java.lang.String position) {
    chessGame.ChessPiece target = getChessPiece(position);
    if (target instanceof chessGame.King)
        checkGameResult(target.getPlayer());
    
    target.updatePosition(null);
}