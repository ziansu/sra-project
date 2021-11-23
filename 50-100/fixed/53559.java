public void displayHelpMenuView() {
    boolean done = false;
    do {
        java.lang.String choice = this.getChoice();
        if (choice.toUpperCase().equals("X"))
            return ;
        
        done = this.doAction(choice);
    } while (!done );
}