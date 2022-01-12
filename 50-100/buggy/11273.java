public void mainMenu() {
    presenter.displayItemsAsMenuOptions(menuOptions);
    com.twu.biblioteca.Option optionSelected;
    do {
        int userInput = presenter.getUserInput(menuOptions.size());
        optionSelected = menuOptions.get((userInput - 1));
        optionSelected.onSelect();
    } while (!(optionSelected instanceof com.twu.biblioteca.QuitOption) );
}