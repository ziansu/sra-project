public boolean hasGameEnded() {
    int countOfAliveWolves = 0;
    int countOfAliveCitizens = 0;
    for (com.raibaz.lupus.game.Player p : g.getPlayers()) {
        if (p.isAlive()) {
            if ((p.getRole()) == (PlayerRole.WOLF)) {
                countOfAliveWolves++;
            }else {
                countOfAliveCitizens++;
            }
        }
    }
    return (countOfAliveWolves == 0) || (countOfAliveWolves >= countOfAliveCitizens);
}