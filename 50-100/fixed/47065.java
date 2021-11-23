private boolean validateGuess(java.lang.String guess) {
    java.lang.Integer column = java.lang.Integer.valueOf(guess.substring(1));
    char[] guessArray = guess.toCharArray();
    if (((guessArray[0]) >= 'A') && ((guessArray[0]) <= 'J')) {
        if ((column >= 1) && (column <= 10)) {
            return true;
        }
    }
    return false;
}