private boolean areAnyLegalMovesForCurrentSide() {
    for (net.torocraft.chess.engine.chess.ChessPieceState chessPieceState : internalState) {
        if (chessPieceState.side.equals(internalChessPieceToMove.side)) {
            net.torocraft.chess.engine.chess.ChessMoveResult moveResult = getChessPieceWorker(chessPieceState).getLegalMoves();
            if ((moveResult.legalPositions.size()) > 1) {
                return true;
            }
        }
    }
    return false;
}