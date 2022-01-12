public void update() {
    this.whiteListedPlayers();
    this.whitelistedPlayersList();
    java.util.List<java.lang.String> whitelistedPlayersList = this.getWhitelistedPlayersList();
    java.util.List<java.lang.String> players = getPlayers();
    this.clear();
    this.update(whitelistedPlayersList, players);
    this.whiteListedPlayers();
    this.whitelistedPlayersList();
}