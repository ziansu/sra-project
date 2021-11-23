public void resetPlayers() {
    for (nl.tudelft.model.Player player : players) {
        player.reset();
        toAdd(player.getWeapon());
    }
}