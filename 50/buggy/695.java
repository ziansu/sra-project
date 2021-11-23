private boolean gameStart() {
    if (!(this.isGameLoaded)) {
        backToMainMenu("game not loaded...");
    }
    this.isGameRun = true;
    this.showStatusGame();
    return true;
}