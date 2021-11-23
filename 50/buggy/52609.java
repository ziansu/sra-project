public void play() {
    createPlayer();
    printWelcome();
    boolean finished = false;
    while (!finished) {
        Command command = parser.getCommand();
        finished = processCommand(command);
    } 
    java.lang.System.out.println("Thank you for playing.  Good bye.");
}