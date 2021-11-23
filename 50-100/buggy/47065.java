private boolean validateGuess(java.lang.String guess) {
    java.lang.Integer column = java.lang.Integer.valueOf(guess.substring(1));
    char[] guessArray = guess.toCharArray();
    if (((guessArray[0]) >= 'A') && ((guessArray[0]) <= 'J')) {
        java.lang.System.out.println(column);
        if ((column >= 1) && (column <= 10)) {
            return true;
        }
    }
    return false;
}