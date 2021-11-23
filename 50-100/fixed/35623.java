public com.myscrabble.entities.LetterTile drawLetter(com.myscrabble.entities.Player playerRef, int index) {
    int randIndex = new java.util.Random().nextInt(letters.size());
    char chosenLetter = letters.get(randIndex);
    letters.remove(randIndex);
    int letterPoints = com.myscrabble.util.ScrabbleUtils.getValueOf(chosenLetter);
    return new com.myscrabble.entities.LetterTile(gsm, playerRef, chosenLetter, letterPoints, true, index);
}