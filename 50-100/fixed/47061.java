private com.rider.jbencode.types.BencodingDictionary readDictionaryElement(final java.nio.CharBuffer buffer) throws com.rider.jbencode.exceptions.BencodingException {
    final com.rider.jbencode.types.BencodingDictionary returnVal = new com.rider.jbencode.types.BencodingDictionary();
    readSingleCharacter(buffer);
    while ((peekSingleCharacter(buffer)) != (com.rider.jbencode.Bencoder.TERMINATION_CHARACTER)) {
        returnVal.put(readStringElement(buffer).getValue(), readElement(buffer));
    } 
    readSingleCharacter(buffer);
    return returnVal;
}