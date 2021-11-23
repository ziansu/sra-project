public int getGuess() {
    do {
        java.lang.System.out.println("Guess a number between 1 and 100: ");
        try {
            guess = java.lang.Integer.parseInt(input.nextLine());
            guesses.add(guess);
        } catch (java.lang.NumberFormatException e) {
            java.lang.System.out.println(("Exception thrown: " + e));
        }
    } while (((guess) > 100) || ((guess) < 1) );
    return guess;
}