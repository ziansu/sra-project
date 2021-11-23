public void play() {
    printStartMessage();
    boolean done = false;
    while (!done) {
        InputCommand inputCommand = parser.getCommand();
        done = processCommand(inputCommand);
    } 
    java.lang.System.out.println(("Thanks for enjoying my little game, have a nice day." + "\n"));
}