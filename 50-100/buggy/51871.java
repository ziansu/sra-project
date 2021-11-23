public void update() {
    currentPlayer.setText((" Current Player: " + (model.getPlayer())));
    currentBankroll.setText((" Current Bankroll: $" + (model.getCurrentBankroll())));
    currentLocation.setText((" Current Location: " + (model.getLocation(model.getPlayer()))));
    playingBoard.update();
}