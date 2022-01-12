public boolean promptForGuess() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    boolean isHit = false;
    boolean isAcceptable = false;
    do {
        java.lang.System.out.print("Enter a letter: ");
        java.lang.String guessInput = scanner.nextLine();
        try {
            isHit = game.applyGuess(guessInput);
            isAcceptable = true;
        } catch (java.lang.IllegalArgumentException iae) {
            java.lang.System.out.printf("%s. Please try again. %n", iae.getMessage());
        }
    } while (!isAcceptable );
    return isHit;
}