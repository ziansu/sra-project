public synchronized void addPlayer(ca.claytonrogers.Common.Connection player) {
    if (authenticatePlayer(player)) {
        playerList.add(player);
    }
}