public boolean hasLost(game.Player currentPlayer) {
    if (((currentPlayer.getNumOfRemainingPieces()) <= 2) || ((generatePossibleMoves(currentPlayer).size()) == 0)) {
        return true;
    }
    return false;
}