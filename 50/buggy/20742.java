public void addPlayerToArray(java.lang.String playername, boolean isReady) {
    currentPlayerName = playername;
    playerList.add(new de.otto.roboapp.model.Player(playername, isReady));
}