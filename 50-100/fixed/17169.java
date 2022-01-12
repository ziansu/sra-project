public void nextActivePlayer() {
    if ((getActivePlayer()) == ((getPlayersNumber()) - 1)) {
        (currentTurn)++;
    }
    activePlayer = getNextPlayer();
    refillNumberOfMoves();
    if (activePlayerHasNoMoves()) {
        nextActivePlayer();
    }
}