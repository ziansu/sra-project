private java.lang.String stringForLiteral(char literal, java.text.StringCharacterIterator iterator) {
    java.lang.String stringToReturn = "";
    char currentChar = iterator.current();
    int stringLength = 1;
    stringLength = this.getLengthForQuantifier(iterator);
    java.util.Random randomizer = new java.util.Random();
    for (int i = 0; i < stringLength; i++) {
        stringToReturn = stringToReturn + literal;
    }
    return stringToReturn;
}