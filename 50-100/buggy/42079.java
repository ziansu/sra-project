@java.lang.Override
public void onNewGameCancel() {
    loadGame = true;
    gameTypeSelected = true;
    trainHeadSelected = true;
    this.rules = 0;
    this.players = 1;
    maxDouble = game.gamehelper.DominoMT.GameWindowMT.DEFAULT_SET;
    for (int i = 1; i <= (players); i++) {
        playerList.add(("Player " + i));
    }
    handInformation.putInt("maxDouble", maxDouble);
    newSet();
    trainHead = maxDouble;
    hand.setTrainHead(maxDouble);
    updateUI();
}