public void playMatch() {
    AbstractPlayer currentPlayer;
    while ((mygame.getWinner()) == (-1)) {
        currentPlayer = players[mygame.getTurn()];
        currentPlayer.receiveState(mygame.getState());
        mygame.update(currentPlayer.getMove());
    } 
    java.lang.System.out.println(("winner is " + (mygame.getWinner())));
}