@java.lang.Override
public boolean doAction(java.lang.String choice) {
    choice = choice.toUpperCase();
    switch (choice) {
        case "1" :
            this.newGame();
            break;
        case "2" :
            this.openGame();
            break;
        case "3" :
            this.displayHelpMenu();
            break;
        case "4" :
            this.printReport();
        default :
            byui.cit260.ransomhacker.view.ErrorView.display(this.getClass().getName(), "\nInvalid Selection");
            break;
    }
    return false;
}