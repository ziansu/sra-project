public boolean isRoundActive() {
    int numberOfPlayers = players.size();
    int count = 0;
    for (scripts.Player p : players)
        if (p.isFolded())
            count++;
        
    
    if ((count > 0) && (count < numberOfPlayers)) {
        return true;
    }
    for (scripts.Player p : players) {
        p.resetActionBoolean();
    }
    table = new scripts.Table();
    round = new scripts.Round(this);
    round.preFlop();
    return false;
}