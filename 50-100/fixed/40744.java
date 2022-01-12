public void onTie() {
    int currPlayerId = currPlayer.getCurrPlayerID();
    int amtBetInGame = currPlayer.getCurrBetInGame();
    currPlayer.winMoney(amtBetInGame);
    message.setText("You Tied!");
    try {
        java.lang.Thread.sleep(5000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}