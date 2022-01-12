public void handleRemovePlayer(int playerId) {
    guiController.showMessage("You couldnt pay and are now out of the game!");
    guiController.removePlayer(playerController.getCurrentPlayer(), fieldController.getFields());
    if ((turn) > playerId) {
        (turn)--;
    }
    playerController.getPlayerList().remove(playerId);
}