private void nextPlayer() {
    currentPlayer = players.get(currentPlayerIndex);
    currentPlayerIndex = (++(currentPlayerIndex)) % (players.size());
}