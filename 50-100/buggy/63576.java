public void chooseGame() {
    int gameChoice;
    if ((player.getWallet()) < (Bet.MINIMUM_BET)) {
        io.zipcoder.zealotscasino.UserInput.display("Just kidding, you broke fam");
        gameChoice = 6;
    }else {
        gameChoice = user.getIntInput("Choose your # of choice: ");
    }
    dealer = io.zipcoder.zealotscasino.Game.makeDealer(gameChoice);
    play(dealer);
}