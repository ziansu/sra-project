public int randomPlayer() {
    int rtn = 0;
    rtn = ((int) ((java.lang.Math.random()) * (GoFish.players.length)));
    if (rtn == (player)) {
        return randomPlayer();
    }else
        if ((GoFish.players[rtn].hand.size()) == 0) {
            return randomPlayer();
        }else {
            return rtn;
        }
    
}