public char filter(char oldChar, char newChar, int pos) {
    if (java.lang.Character.isLetter(newChar)) {
        if (java.lang.Character.isLetter(oldChar)) {
            return newChar;
        }else
            if ((numAnagramLetters) < curWordLen) {
                (numAnagramLetters)++;
                return newChar;
            }else {
                return ' ';
            }
        
    }else {
        return ' ';
    }
}