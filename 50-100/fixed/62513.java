public void checkGameOver() {
    gameItems.Token t;
    for (int token = 0; token < 4; token++) {
        t = players.get(turn).getTokens()[token];
        if (!(inHome(t))) {
            return ;
        }
    }
    gameInProgress = false;
}