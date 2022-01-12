public void askGuess() {
    java.lang.Object[] options = new java.lang.Object[]{ null };
    guess = ((java.lang.String) (javax.swing.JOptionPane.showInputDialog(null, "Please make a guess", "Hangman", javax.swing.JOptionPane.INFORMATION_MESSAGE, whatImg(), null, options[0])));
    while ((guess) == null) {
        wordOrLetter();
        askGuess();
    } 
    guessUpper = guess.toUpperCase();
    guessLower = guess.toLowerCase();
}