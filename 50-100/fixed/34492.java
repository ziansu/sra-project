public void testConvertOptionalFunctionParameters() throws java.lang.Exception {
    java.util.LinkedHashMap<java.lang.String, com.google.javascript.rhino.Node.TypeDeclarationNode> parameters = new java.util.LinkedHashMap<>();
    parameters.put("p1", com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.optionalParameter(com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.unionType(com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.nullType(), com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.stringType())));
    parameters.put("p2", com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.optionalParameter(com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.numberType()));
    assertParseTypeAndConvert("function(?string=, number=)").isEqualTo(com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.functionType(com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.anyType(), parameters, null, null));
}