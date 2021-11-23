@java.lang.SuppressWarnings(value = "resource")
public boolean promptForGuess() {
    java.lang.System.out.print("Enter new letter: ");
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    boolean isHit = false;
    boolean isValidGuess = false;
    while (!isValidGuess) {
        java.lang.String guessAsString = scan.nextLine();
        char guess = guessAsString.charAt(0);
        try {
            isHit = mGame.applyGuess(guess);
            isValidGuess = true;
        } catch (java.lang.IllegalArgumentException iae) {
            java.lang.System.out.println("Please try again");
            java.lang.System.out.println(iae.getMessage());
        }
    } 
    return isHit;
}