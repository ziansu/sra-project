private com.jensen.boardgames.othello.model.player.OthelloPlayer nextPlayer() {
    if (com.jensen.boardgames.othello.model.Othello.isGameOver(this)) {
        return null;
    }
    currentPlayerIndex = ((currentPlayerIndex) + 1) % (players.length);
    setCurrentPlayer(players[currentPlayerIndex]);
    if ((com.jensen.boardgames.othello.model.Othello.getValidMoves(this).length) > 0) {
        nextPlayer();
    }
    return getCurrentPlayer();
}