void playerChecked() {
    currentPlayer.hasToCheckTheRaise = false;
    if ((raisedBy) > 0) {
        currentPlayer.cash -= (raisedBy) - (currentPlayer.moenyPutIntoCurrentPot);
        potValue += (raisedBy) - (currentPlayer.moenyPutIntoCurrentPot);
    }
}