public void chooseGame() {
    int gameChoice;
    if ((Bet.MINIMUM_BET) > (player.getWallet())) {
        io.zipcoder.zealotscasino.UserInput.display("Just kidding, you broke fam");
        return ;
    }else {
        gameChoice = user.getIntInput("Choose your # of choice: ");
    }
    dealer = io.zipcoder.zealotscasino.Game.makeDealer(gameChoice);
    play(dealer);
}