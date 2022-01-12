@java.lang.Override
public char GetGuess(java.util.List<java.lang.Character> currentClue) {
    buildAlphabet();
    char letter = alphabet.get(0);
    guessedLetters.add(letter);
    return letter;
}