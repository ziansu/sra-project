<T> play.mvc.Result okResult(java.util.List<T> list, java.lang.String typeName) {
    com.fasterxml.jackson.databind.JsonNode node = org.sagebionetworks.bridge.play.controllers.BaseController.mapper.valueToTree(new org.sagebionetworks.bridge.models.ResourceList<T>(list));
    com.fasterxml.jackson.databind.node.ArrayNode items = ((com.fasterxml.jackson.databind.node.ArrayNode) (node.get("items")));
    for (int i = 0; i < (items.size()); i++) {
        ((com.fasterxml.jackson.databind.node.ObjectNode) (items.get(i))).put("type", typeName);
    }
    return ok(node);
}