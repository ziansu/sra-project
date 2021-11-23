@java.lang.Override
public com.microsoft.azure.CloudError deserialize(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws java.io.IOException {
    com.fasterxml.jackson.databind.JsonNode errorNode = p.readValueAsTree();
    if (errorNode == null) {
        return null;
    }
    if ((errorNode.get("error")) != null) {
        errorNode = errorNode.get("error");
    }
    com.fasterxml.jackson.core.JsonParser parser = new com.fasterxml.jackson.core.JsonFactory().createParser(errorNode.toString());
    parser.setCodec(mapper);
    return parser.readValueAs(com.microsoft.azure.CloudError.class);
}