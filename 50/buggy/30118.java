private void removeChessPiece(java.lang.String position) {
    chessGame.ChessPiece target = getChessPiece(position);
    if (target instanceof chessGame.King) {
        chessGame.ChessPlayer winner = target.getPlayer();
    }
    chessGame.ChessMonitoringSystem.allChessPieces.remove(target);
    checkGameResult(winner);
}