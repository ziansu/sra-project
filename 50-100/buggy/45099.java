@java.lang.Override
public io.swagger.models.properties.Property deserialize(com.fasterxml.jackson.core.JsonParser jp, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    com.fasterxml.jackson.databind.JsonNode node = jp.getCodec().readTree(jp);
    io.swagger.models.properties.Property property = propertyFromNode(node);
    property.setXml(getXml(node));
    return property;
}