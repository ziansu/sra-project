protected float scorePiece(puzzlesolver.solver.State state, puzzlesolver.Piece foundPiece) {
    int totalPotentialMatches = 0;
    for (puzzlesolver.enums.PieceType pieceType : foundPiece.getPieceTypes()) {
        totalPotentialMatches += state.unplacedPieces.sublistByType(pieceType).size();
    }
    return 1.0F / totalPotentialMatches;
}