public void testConvertRecordType() throws java.lang.Exception {
    java.util.LinkedHashMap<java.lang.String, com.google.javascript.rhino.Node.TypeDeclarationNode> properties = new java.util.LinkedHashMap<>();
    properties.put("myNum", com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.numberType());
    properties.put("myObject", com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.unknownType());
    assertParseTypeAndConvert("{myNum: number, myObject}").isEqualTo(com.google.javascript.jscomp.parsing.TypeDeclarationsIRFactory.recordType(properties));
}