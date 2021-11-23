void sendTextToSocketAndStartANewGame(java.lang.String text) {
    this.game.acceptPlayersName(text);
    this.playerNameVBox.setVisible(false);
    new java.lang.Thread(this::buildPlayerBoard).start();
}