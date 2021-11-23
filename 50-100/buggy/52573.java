public boolean isCheck() {
    final crazygames.android.anytimechess.engine.pieces.King king = (turn.equals(Piece.Color.WHITE)) ? board.getBlackKing() : board.getWhiteKing();
    if (crazygames.android.anytimechess.engine.pieces.Piece.underAttack(king.color(), king.getCol(), king.getRow(), this)) {
        board.rollback();
        return true;
    }
    return false;
}