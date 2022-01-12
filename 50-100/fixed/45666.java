private void humanTurn() {
    java.lang.System.out.print("Enter coordinates for your guess : ");
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    java.lang.String guess = input.nextLine();
    boolean guessIsValid = validateGuess(guess);
    if (!guessIsValid) {
        java.lang.System.out.println("You Moron look at the effing board! That doesn't even make sense!");
        humanTurn();
    }
    if (wasHit(getNextPlayer(), guess)) {
        java.lang.System.out.println("HIT!");
        getCurrentPlayerHits().add(guess);
    }else {
        java.lang.System.out.println("Miss :( ");
    }
    getCurrentPlayerGuesses().add(guess);
}