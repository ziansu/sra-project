private boolean isKingInCheck() {
    for (net.torocraft.chess.engine.chess.ChessPieceState chessPieceState : internalState) {
        if (!(chessPieceState.side.equals(internalChessPieceToMove.side))) {
            net.torocraft.chess.engine.chess.ChessMoveResult moveResult = getChessPieceWorker(internalState, chessPieceState).getLegalMoves();
            for (net.torocraft.chess.engine.GamePieceState.Position position : moveResult.legalPositions) {
                if ((position.rank.equals(currentKingState.position.rank)) && (position.file.equals(currentKingState.position.file))) {
                    return true;
                }
            }
        }
    }
    return false;
}