private boolean allHaveAlledIn() {
    int alledIn = 0;
    int notAlledIn = 0;
    for (com.sackhorn.poker.game.Player player : allPlayers) {
        if (((player.hasToCheckTheRaise) && (!(player.hasLost))) && (!(player.hasLost))) {
            notAlledIn++;
        }
    }
    if (notAlledIn <= 1)
        return true;
    else
        return false;
    
}