private java.lang.String readJsonData(com.fasterxml.jackson.databind.JsonNode node) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    com.fasterxml.jackson.databind.JsonNode rootNode = node.path("logs");
    java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> iterator = rootNode.elements();
    while (iterator.hasNext()) {
        java.lang.String current = (iterator.next().toString()) + ",";
        builder.append(current);
    } 
    return builder.toString();
}