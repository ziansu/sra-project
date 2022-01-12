private boolean guessLetter(char letter) {
    boolean guessed = false;
    int index = 0;
    letter = java.lang.Character.toLowerCase(letter);
    for (char wordCharacter : word.toCharArray()) {
        if (wordCharacter == letter) {
            censoredWord.add(index, letter);
            guessed = true;
        }
        index++;
    }
    return guessed;
}