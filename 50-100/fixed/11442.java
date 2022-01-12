public void onWin() {
    int currPlayerId = currPlayer.getCurrPlayerID();
    int potVal = currPlayer.getPot();
    int amtBetInGame = currPlayer.getCurrBetInGame();
    if ((amtBetInGame * 2) >= potVal)
        currPlayer.winMoney(potVal);
    else
        currPlayer.winMoney((amtBetInGame * 2));
    
    message.setText("You Win!");
    try {
        java.lang.Thread.sleep(5000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}