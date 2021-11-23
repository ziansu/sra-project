public void handleRemovePlayer(int playerId, int turn) {
    guiController.showMessage("You couldnt pay and are now out of the game!");
    guiController.removePlayer(playerController.getCurrentPlayer(), fieldController.getFields());
    playerController.getPlayerList().remove(playerId);
    this.turn = turn;
}