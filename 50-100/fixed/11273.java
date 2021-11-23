public void mainMenu() {
    com.twu.biblioteca.Option optionSelected;
    do {
        presenter.displayItemsAsMenuOptions(menuOptions);
        int userInput = presenter.getUserInput(menuOptions.size());
        optionSelected = menuOptions.get((userInput - 1));
        optionSelected.onSelect();
    } while (!(optionSelected instanceof com.twu.biblioteca.QuitOption) );
}