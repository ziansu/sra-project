private void addNewPlayer(java.lang.String player1Name, Disc disc) {
    IPlayer player = (IsAI(player1Name)) ? new AIPlayer(player1Name, disc) : new HumanPlayer(console, player1Name, disc);
    if (disc == (Disc.X)) {
        playerX = player;
    }
    if (disc == (Disc.O)) {
        playerO = player;
    }
}