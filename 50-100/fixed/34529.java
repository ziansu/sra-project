public boolean isRoundActive() {
    int count = 0;
    for (scripts.Player p : players)
        if (p.isFolded())
            count++;
        
    
    if (count != 1) {
        return true;
    }
    for (scripts.Player p : players) {
        p.resetActionBoolean();
    }
    payout();
    return false;
}