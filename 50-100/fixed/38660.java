public void playMatch() {
    AbstractPlayer currentPlayer;
    while ((mygame.getWinner()) == 0) {
        currentPlayer = players[((mygame.getTurn()) - 1)];
        currentPlayer.receiveState(mygame.getState());
        mygame.update(currentPlayer.getMove());
    } 
    java.lang.System.out.println(("winner is " + (mygame.getWinner())));
}