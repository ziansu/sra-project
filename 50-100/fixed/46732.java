private java.lang.String stringForDotToken(java.text.StringCharacterIterator iterator) {
    java.lang.StringBuilder stringToReturn = new java.lang.StringBuilder();
    java.util.Random randomizer = new java.util.Random();
    int stringLongitude;
    stringLongitude = this.getLengthForQuantifier(iterator);
    for (int i = 0; i < stringLongitude; i++) {
        int randomNumber = 33 + (randomizer.nextInt((127 - 33)));
        stringToReturn.append(((char) (randomNumber)));
    }
    return stringToReturn.toString();
}