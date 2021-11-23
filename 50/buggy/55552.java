private java.lang.String processLiteralToken(java.text.StringCharacterIterator iterator) {
    java.lang.String stringToReturn = "";
    char literal = iterator.current();
    char currentChar = iterator.next();
    stringToReturn = stringToReturn + (this.stringForLiteral(literal, iterator));
    return stringToReturn;
}