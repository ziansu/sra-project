public void testConvertSimpleTypes() {
    assertParseTypeAndConvert("?").hasType(com.google.javascript.rhino.Token.ANY_TYPE);
    assertParseTypeAndConvert("boolean").hasType(com.google.javascript.rhino.Token.BOOLEAN_TYPE);
    assertParseTypeAndConvert("null").hasType(com.google.javascript.rhino.Token.NULL_TYPE);
    assertParseTypeAndConvert("number").hasType(com.google.javascript.rhino.Token.NUMBER_TYPE);
    assertParseTypeAndConvert("string").hasType(com.google.javascript.rhino.Token.STRING_TYPE);
    assertParseTypeAndConvert("void").hasType(com.google.javascript.rhino.Token.VOID_TYPE);
    assertParseTypeAndConvert("undefined").hasType(com.google.javascript.rhino.Token.UNDEFINED_TYPE);
}