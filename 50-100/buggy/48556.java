public boolean promptForGuess() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    boolean isCorrect = false;
    boolean isAcceptable = false;
    do {
        java.lang.System.out.print("Enter a number:  ");
        int guessInput = scanner.nextInt();
        try {
            isCorrect = jar.applyGuess(guessInput);
            isAcceptable = true;
        } catch (java.lang.IllegalArgumentException iae) {
            java.lang.System.out.printf("%s. Please try again. %n", iae.getMessage());
        }
    } while (!isAcceptable );
    return isCorrect;
}