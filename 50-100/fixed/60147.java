public java.lang.String winner(rules.Game game) {
    int winnerNumber = 0;
    for (int handTotalNumber = 0; handTotalNumber < (totalArraySize()); handTotalNumber++) {
        int newTotal = handTotals.get(handTotalNumber);
        if (newTotal > (handTotals.get(winnerNumber))) {
            winnerNumber = newTotal;
        }
    }
    rules.Player winner = game.getPlayer(winnerNumber);
    winnerNumber = 0;
    return (winner.getName()) + " won this round";
}