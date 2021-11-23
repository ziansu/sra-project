private static com.networknt.schema.JsonSchema getJsonSchemaFromStringContent(java.lang.String schemaContent) {
    com.networknt.schema.JsonSchemaFactory factory = new com.networknt.schema.JsonSchemaFactory();
    return factory.getSchema(schemaContent);
}