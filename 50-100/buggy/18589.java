public void testConvertVariableParameters() throws java.lang.Exception {
    com.google.javascript.rhino.Node stringKey1 = com.google.javascript.rhino.IR.stringKey("p1");
    stringKey1.addChildToFront(com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.stringType());
    com.google.javascript.rhino.Node stringKey2 = com.google.javascript.rhino.IR.stringKey("p2");
    stringKey2.addChildToFront(new com.google.javascript.rhino.Node.TypeDeclarationNode(com.google.javascript.rhino.Token.REST_PARAMETER_TYPE, com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.numberType()));
    assertParseTypeAndConvert("function(string, ...number): number").isEqualTo(new com.google.javascript.rhino.Node.TypeDeclarationNode(com.google.javascript.rhino.Token.FUNCTION_TYPE, com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.numberType(), stringKey1, stringKey2));
}