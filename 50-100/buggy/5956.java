public void setActivePlayers() {
    for (players.Player player : players) {
        if ((player.getStake()) >= (currentBigBlind)) {
            player.setActive(true);
            activePlayers.add(player);
        }else {
            player.setActive(false);
        }
    }
}