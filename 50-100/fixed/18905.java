public void reset() {
    dealerHand = new application.Hand();
    playerHand = new application.Hand();
    playerBusted = false;
    dealerBusted = false;
    gameOver = true;
    hit = false;
    doubleDown = false;
    gameStarted = false;
    playerWins = false;
    dealerWins = false;
    push = false;
}