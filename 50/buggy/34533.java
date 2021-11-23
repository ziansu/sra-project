public boolean noPlayersRemaining() {
    int cardCounter = 0;
    for (game_models.Player player : players) {
        cardCounter += player.handSize();
        if (cardCounter == 0) {
            return true;
        }
    }
    return false;
}