public char filter(char oldChar, char newChar, int pos) {
    if (((numAnagramLetters) < curWordLen) && (java.lang.Character.isLetter(newChar))) {
        (numAnagramLetters)++;
        return newChar;
    }else {
        return ' ';
    }
}