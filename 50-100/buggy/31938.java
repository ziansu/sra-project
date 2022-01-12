public void run() throws java.io.IOException {
    int userCommand;
    showWelcomeWords();
    com.twu.biblioteca.valueObject.menu.Menu mainMenu = new com.twu.biblioteca.valueObject.menu.MainMenu(new com.twu.biblioteca.ui.PartTitleUIImp1(), new com.twu.biblioteca.ui.OptionUIImp1());
    mainMenu.show();
    userCommand = mainMenu.readNextCommand();
    while (userCommand != (mainMenu.getOptions().size())) {
        mainMenu.interActOption(mainMenu.askForAValidSelection());
        mainMenu.show();
    } 
}