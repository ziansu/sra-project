private void saveGame() {
    this.console.println("*** saveGame Function called ***");
    java.lang.System.out.println("\nEnter the file path for file where the game is to be saved.");
    java.lang.String filePath = this.getInput();
    try {
        Control.GameControls.saveGame(BiseJosephTeam.game, filePath);
    } catch (java.lang.Exception ex) {
        View.ErrorView.display("MainMenuView", ex.getMessage());
    }
}