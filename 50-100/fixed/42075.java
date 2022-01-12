private void convertSimpleFieldToJson(com.fasterxml.jackson.databind.node.ObjectNode node, com.redhat.lightblue.metadata.FieldTreeNode field, java.lang.Object value, java.lang.String fieldName) {
    com.fasterxml.jackson.databind.JsonNode valueNode = field.getType().toJson(factory, value);
    if (valueNode != null) {
        node.set(fieldName, valueNode);
    }
}