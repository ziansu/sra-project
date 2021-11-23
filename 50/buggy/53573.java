public static com.networknt.schema.JsonSchema getJsonSchemaFromStringContent(java.lang.String schemaContent) throws java.lang.Exception {
    com.networknt.schema.JsonSchemaFactory factory = new com.networknt.schema.JsonSchemaFactory();
    com.networknt.schema.JsonSchema schema = factory.getSchema(schemaContent);
    return schema;
}