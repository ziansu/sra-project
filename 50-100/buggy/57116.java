private void doAction(char selection) {
    switch (selection) {
        case 'M' :
            this.displayMoveMenu();
            break;
        case 'D' :
            this.displayMap();
            break;
        case 'I' :
            this.displayPlayerItems();
            break;
        case 'C' :
            this.listChallenges();
            break;
        case 'R' :
            this.returnToMainMenu();
            break;
        case 'H' :
            this.displayHelpMenu();
            break;
        default :
            java.lang.System.out.println("Invalid selection");
            break;
    }
}