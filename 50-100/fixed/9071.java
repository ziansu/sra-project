public void makeBestMoveAccordingToAILogic(chess.domain.GameSituation game) {
    ais[((game.getTurn()) % 2)].findBestMoves(game);
    chess.domain.Move move = ais[((game.getTurn()) % 2)].getBestMove();
    setChosen(move.getPiece());
    moveToTargetLocation(move.getTarget().getColumn(), move.getTarget().getRow(), game, true);
}