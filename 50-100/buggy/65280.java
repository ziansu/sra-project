public boolean promptForGuess() {
    java.io.Console console = java.lang.System.console();
    boolean isHit = false;
    boolean isValidGuess = false;
    while (!isValidGuess) {
        java.lang.String guessAsString = console.readLine("Enter a letter:");
        char guess = guessAsString.charAt(0);
        try {
            isHit = mGame.applyGuess(guess);
            isValidGuess = true;
        } catch (java.lang.IllegalArgumentException iae) {
            console.printf("%s. Please try again.\n", iae.getMessage());
        }
    } 
    return isHit;
}