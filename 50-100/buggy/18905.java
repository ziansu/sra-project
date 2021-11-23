public void reset() {
    aDeck = new application.Deck(Main.cardIMG);
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