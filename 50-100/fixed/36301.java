private java.lang.String stringForLiteral(char literal, java.text.StringCharacterIterator iterator) {
    java.lang.StringBuilder stringToReturn = new java.lang.StringBuilder();
    int stringLength;
    stringLength = this.getLengthForQuantifier(iterator);
    for (int i = 0; i < stringLength; i++) {
        stringToReturn.append(literal);
    }
    return stringToReturn.toString();
}