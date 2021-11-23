@java.lang.Override
public void emitTypeConversion(java.lang.String setter, java.lang.String fieldName, java.lang.String fieldType, com.squareup.javawriter.JavaWriter writer) throws java.io.IOException {
    writer.beginControlFlow("if (!json.isNull(\"%s\"))", fieldName).emitStatement("Object timestamp = json.get(\"%s\")", fieldName).beginControlFlow("if (timestamp instanceof String)").emitStatement("obj.%s(JsonUtils.stringToDate((String) timestamp))", setter).nextControlFlow("else").emitStatement("obj.%s(new Date(json.getLong(\"%s\")))", setter, fieldName).endControlFlow().endControlFlow();
}