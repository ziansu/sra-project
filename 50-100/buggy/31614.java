private static void parsePiece(java.lang.String pn, java.util.List<com.trycatch.chess.inputvalidation.ChessPiece> pieces) throws com.trycatch.chess.exceptions.UndefinedPieceException {
    java.lang.String[] pieceNumber = pn.split(":");
    com.trycatch.chess.inputvalidation.ChessPiece piece = com.trycatch.chess.inputvalidation.Validation.parseName(pieceNumber[0]);
    int number = java.lang.Integer.parseInt(pieceNumber[1]);
    for (int i = 0; i < number; i++) {
        pieces.add(piece);
    }
}