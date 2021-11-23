public void startProgram() {
    this.displayBanner();
    java.lang.String playersName = this.getPlayersName();
    byui.cit260.detectiveWizard.model.Player player = byui.cit260.detectiveWizard.control.ProgramControl.createPlayer(playersName);
    this.displayWelcomeMessage(player);
    byui.cit260.detectiveWizard.view.MainMenuView mainMenu = new byui.cit260.detectiveWizard.view.MainMenuView();
    mainMenu.display();
}