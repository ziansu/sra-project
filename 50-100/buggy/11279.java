private void handleRemovePlayer() {
    guiController.showMessage("You couldnt pay and are now out of the game!");
    guiController.removePlayer(playerController.getCurrentPlayer(), fieldController.getFields());
    playerController.getPlayerList().remove(playerController.getCurrentPlayer());
    (turn)--;
}