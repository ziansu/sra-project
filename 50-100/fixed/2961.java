public static com.sforce.dataset.loader.file.schema.ExternalFileSchema load(java.io.InputStream inputStream, java.nio.charset.Charset fileCharset, java.io.PrintStream logger) throws com.fasterxml.jackson.core.JsonParseException, com.fasterxml.jackson.databind.JsonMappingException, java.io.IOException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    com.sforce.dataset.loader.file.schema.ExternalFileSchema userSchema = mapper.readValue(inputStream, com.sforce.dataset.loader.file.schema.ExternalFileSchema.class);
    if (userSchema == null) {
        throw new java.lang.IllegalArgumentException("Could not read schema from stream {null}");
    }
    com.sforce.dataset.loader.file.schema.ExternalFileSchema.validateSchema(userSchema, logger);
    return userSchema;
}