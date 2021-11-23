public Player getNextPlayer() {
    int lastPlayerPosition = (players.size()) - 1;
    int currentPlayerPosition = players.indexOf(currentPlayer);
    if (currentPlayerPosition == lastPlayerPosition) {
        currentPlayerPosition = 0;
    }else {
        currentPlayerPosition++;
    }
    currentPlayer = players.get(currentPlayerPosition);
    return currentPlayer;
}