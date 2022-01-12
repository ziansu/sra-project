public boolean hasLost(game.Player currentPlayer) {
    return ((currentPlayer.getNumOfRemainingPieces()) <= 2) || ((generatePossibleMoves(currentPlayer).size()) == 0);
}