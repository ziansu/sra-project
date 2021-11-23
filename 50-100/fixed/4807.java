public boolean isRoundActive() {
    int numberOfPlayers = players.size();
    int count = 0;
    for (scripts.Player p : players)
        if (p.isFolded())
            count++;
        
    
    table = new scripts.Table();
    round = new scripts.Round(this);
    round.preFlop();
    return false;
}