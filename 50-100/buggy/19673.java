public Player getNextPlayer() {
    int lastPlayerPosition = (players.size()) - 1;
    int currentPlayerPosition = players.indexOf(currentPlayer);
    if (currentPlayerPosition == lastPlayerPosition) {
        currentPlayerPosition = 0;
    }else {
        currentPlayerPosition++;
    }
    return players.get(currentPlayerPosition);
}