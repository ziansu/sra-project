public void checkGameOver() {
    gameItems.Token t;
    int debug_s = 0;
    int debug_h = 0;
    for (int token = 0; token < 4; token++) {
        t = players.get(turn).getTokens()[token];
        if (!(inHome(t))) {
            return ;
        }else
            debug_h++;
        
        if ((t.getSpaceID()) == (startSpaces[turn]))
            debug_s++;
        
    }
    gameInProgress = false;
}