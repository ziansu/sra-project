public boolean doAction(java.lang.Object obj) {
    char selection = ((char) (obj));
    switch (selection) {
        case 'G' :
            this.displayGameObjective();
            break;
        case 'H' :
            this.displayHowToPlay();
            break;
        case 'V' :
            this.viewPlayersInventory();
            break;
        case 'E' :
            return true;
        default :
            this.console.println(("\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e [ WARNING! ] \u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\n" + ("\tInvalid selection - Please, try again.             \n" + "\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\u221e\n")));
    }
    return true;
}