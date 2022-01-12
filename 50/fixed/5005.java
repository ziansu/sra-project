void sendTextToSocketAndStartANewGame(java.lang.String text) {
    game.acceptPlayersName(text);
    playerNameVBox.setVisible(false);
    new java.lang.Thread(this::buildPlayerBoard).start();
}