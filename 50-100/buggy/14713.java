public boolean restartGame() {
    if (!(this.isGameRun)) {
        backToMainMenu("cannot do restart because no game run..");
    }
    userInterface.printMassage("restarting...");
    this.whoPlay = 0;
    this.propWhoPlay.set("Player 1");
    this.players = null;
    this.gameStatistic = null;
    this.isGameRun = false;
    this.isGameLoaded = false;
    userInterface.printMassage("restart successfully!");
    this.userInterface.printMenu(mainMenu, "middle");
    return true;
}