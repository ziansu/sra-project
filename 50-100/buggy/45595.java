public void displayStartProgramView() {
    boolean done = false;
    do {
        java.lang.String playersName = this.getPlayersName();
        if (playersName.toUpperCase().equals("Q"))
            return ;
        
        done = this.doAction(playersName);
    } while (!done );
    java.lang.System.out.println("\n *** displayStartProgram() function called ***");
}