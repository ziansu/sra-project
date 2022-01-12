private void preFlop() {
    (currentHandStage)++;
    for (players.Player player : activePlayers) {
        this.board.dealHoleCards(player, 2);
        java.lang.System.out.println((("[TEST] " + (player.toString())) + " ha carte: "));
        for (poker.Card card : player.getCards()) {
            java.lang.System.out.println(("[TEST] " + (card.toString())));
        }
    }
    notifyHiddenPlayersUpdated(players);
    bettingRound();
}