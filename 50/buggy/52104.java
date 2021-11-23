public Players.Player getNextPlayer() {
    java.lang.System.out.println(players.length);
    return players[((currentPlayer) - 1)];
}