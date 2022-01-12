private com.jensen.boardgames.othello.model.player.OthelloPlayer randomPlayer() {
    if (com.jensen.boardgames.othello.model.Othello.isGameOver(this)) {
        return null;
    }
    currentPlayerIndex = new java.util.Random().nextInt(players.length);
    setCurrentPlayer(players[currentPlayerIndex]);
    if ((com.jensen.boardgames.othello.model.Othello.getValidMoves(this).length) > 0) {
        nextPlayer();
    }
    return getCurrentPlayer();
}