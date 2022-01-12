void gameOver(java.lang.String str) {
    message.setText(str);
    newGameButton.setEnabled(true);
    resignButton.setEnabled(false);
    gameInProgress = false;
}