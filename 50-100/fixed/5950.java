public void startGame() {
    start();
    while ((turnCount) == 0) {
        play(player1, cup, rule);
        play(player2, cup, rule);
    } 
    while ((turnCount) == 1) {
        play(player2, cup, rule);
        play(player1, cup, rule);
    } 
}