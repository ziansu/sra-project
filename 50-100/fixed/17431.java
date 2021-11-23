private java.lang.String processSetToken(java.text.StringCharacterIterator iterator) {
    java.lang.String stringToReturn = "";
    java.util.ArrayList<java.lang.Character> setOfPossibleChars = this.getSetOfChars(iterator);
    iterator.next();
    stringToReturn = stringToReturn + (this.stringWithSetToken(setOfPossibleChars, iterator));
    return stringToReturn;
}