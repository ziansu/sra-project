@java.lang.SuppressWarnings(value = "unchecked")
public java.lang.String getJsonSchemaFromClass(java.lang.Class javaClass) throws java.io.IOException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    com.kjetland.jackson.jsonSchema.JsonSchemaGenerator schemaGen = new com.kjetland.jackson.jsonSchema.JsonSchemaGenerator(mapper);
    com.fasterxml.jackson.databind.JsonNode jsonSchema = schemaGen.generateJsonSchema(javaClass);
    java.lang.String jsonSchemaAsString = mapper.writeValueAsString(jsonSchema);
    log.trace(jsonSchemaAsString);
    return jsonSchemaAsString;
}