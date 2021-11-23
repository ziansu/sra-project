private java.lang.String stringForDotToken(java.text.StringCharacterIterator iterator) {
    java.lang.String stringToReturn = "";
    java.util.Random randomizer = new java.util.Random();
    char currentChar = iterator.current();
    int stringLongitude = 1;
    stringLongitude = this.getLengthForQuantifier(iterator);
    for (int i = 0; i < stringLongitude; i++) {
        int randomNumber = 33 + (randomizer.nextInt((127 - 33)));
        stringToReturn = stringToReturn + ((char) (randomNumber));
    }
    return stringToReturn;
}