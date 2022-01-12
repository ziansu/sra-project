public void removeAllWhiteListedPlayers() {
    java.util.List<java.lang.String> players = getPlayers();
    for (java.lang.String player : players) {
        myRemovePlayer(player.toLowerCase());
    }
    this.whitelist.save();
}