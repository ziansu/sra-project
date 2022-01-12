private void getCharGuess() {
    java.lang.String getChar = readLine("Your guess: ");
    getChar = getChar.toUpperCase();
    while (true) {
        if ((getChar.length()) > 1) {
            getChar = readLine("You can only guess one letter at a time. Try again: ");
        }
        if ((getChar.length()) == 1)
            break;
        
    } 
    ch = getChar.charAt(0);
}