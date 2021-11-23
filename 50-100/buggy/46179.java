public void addPlayer(players.Player player) {
    boolean presence = false;
    for (players.Player giocatore : players) {
        if (giocatore.getName().equals(player.getName())) {
            presence = true;
        }
    }
    if (presence == false) {
        players.add(player);
        player.setStake(settings.getStartingStake());
    }else {
        throw new poker.InvalidPlayerNameException("Nome già utilizzato!");
    }
}