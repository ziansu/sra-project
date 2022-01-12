public boolean hasLost(game.Player currentPlayer, java.util.List<game.Move> possibleMoves) {
    return ((currentPlayer.getNumOfRemainingPieces()) <= 2) || ((possibleMoves.size()) == 0);
}