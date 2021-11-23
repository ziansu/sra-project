@java.lang.Override
public com.microsoft.azure.CloudError deserialize(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    com.fasterxml.jackson.databind.JsonNode topNode = p.readValueAsTree();
    if (topNode == null) {
        return null;
    }
    com.fasterxml.jackson.databind.JsonNode errorNode = topNode.get("error");
    if (errorNode == null) {
        return null;
    }
    com.fasterxml.jackson.core.JsonParser parser = new com.fasterxml.jackson.core.JsonFactory().createParser(errorNode.toString());
    parser.setCodec(mapper);
    return parser.readValueAs(com.microsoft.azure.CloudError.class);
}