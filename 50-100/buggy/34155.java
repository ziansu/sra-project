protected void deserialize(T service, com.fasterxml.jackson.core.JsonParser jsonParser, com.fasterxml.jackson.databind.JsonNode node, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    final com.fasterxml.jackson.databind.JsonNode serviceEnabledNode = node.get("enabled");
    if (serviceEnabledNode != null) {
        service.setEnabled(serviceEnabledNode.asBoolean(true));
    }else {
        service.setEnabled(true);
    }
}