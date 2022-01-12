public void promoteTo(com.nullpointergames.boardgames.chess.PieceType pieceType) {
    com.nullpointergames.boardgames.chess.rules.PawnRule pawnRule = new com.nullpointergames.boardgames.chess.rules.PawnRule(board, null);
    pawnRule.promoteTo(board, pieceType);
}