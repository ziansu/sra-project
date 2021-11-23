public com.comandante.creeper.player.Player addPlayer(com.comandante.creeper.player.Player player) {
    return players.putIfAbsent(player.getPlayerId(), player);
}