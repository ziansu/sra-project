public void removeAllWhiteListedPlayers() {
    java.util.List<java.lang.String> players = getPlayers();
    for (java.lang.String player : players) {
        myRemovePlayer(player);
    }
    this.whitelist.save();
}