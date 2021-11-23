public com.comandante.creeper.player.Player addPlayer(com.comandante.creeper.player.Player player) {
    return players.put(player.getPlayerId(), player);
}