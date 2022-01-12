public static java.lang.String getString(@javax.validation.constraints.NotNull
java.lang.String json, @com.sun.istack.internal.Nullable
java.lang.String... paths) {
    com.fasterxml.jackson.databind.JsonNode node = com.coeus.commons.json.JSON.parseJsonNode(json, paths);
    if ((com.coeus.commons.Check.isNull(node)) || (node.isNull())) {
        return null;
    }
    if (node.isValueNode()) {
        return node.textValue();
    }
    return com.coeus.commons.json.JSON.toJsonString(node);
}