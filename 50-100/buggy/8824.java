public void startProgram() {
    this.displayBanner();
    java.lang.String playersName = this.getPlayersName();
    byui.cit260.hobbit.model.Player player = byui.cit260.hobbit.control.ProgramControl.createPlayer(playersName);
    byui.cit260.hobbit.model.GoldPouch goldPouch = byui.cit260.hobbit.control.ProgramControl.createSmallPouch();
    this.displayWelcomeMessage(player);
    byui.cit260.hobbit.view.MainMenuView mainMenu = new byui.cit260.hobbit.view.MainMenuView();
    mainMenu.display();
}