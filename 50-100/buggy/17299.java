private void play() {
    model.startGame();
    printInterstitial(model.whoseTurn());
    while (!(model.isGameOver())) {
        ad310.battleship.Player currentPlayer = model.whoseTurn();
        promptPlayer(currentPlayer);
        ad310.battleship.Player playerAfterTurn = model.whoseTurn();
        if (!(currentPlayer.equals(playerAfterTurn))) {
            printInterstitial(playerAfterTurn);
        }
    } 
}