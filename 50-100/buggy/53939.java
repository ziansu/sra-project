public void checkClientConnections() {
    boolean spy = false;
    for (players.Player player : players) {
        if (!(player.getClient().isConnected())) {
            disconnectPlayer(player);
            spy = true;
        }
    }
    if (spy)
        notifyHiddenPlayersUpdated(players);
    
}