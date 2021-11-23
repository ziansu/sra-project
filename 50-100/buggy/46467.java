private void handleWinningConditions() {
    if ((playerController.getPlayerList().size()) == 1) {
        gameOver = true;
        guiController.showMessage((((playerController.getPlayerList().get(0)) + " ") + (Language.GameController_WonGameCongratulations)));
    }
}