public void handleNode(com.fasterxml.jackson.databind.JsonNode node, java.io.OutputStream ops) throws java.io.IOException {
    if (node.isObject()) {
        handleObject(com.fasterxml.jackson.databind.node.ObjectNode.class.cast(node), ops);
    }else
        if (node.isArray()) {
            handleArray(com.fasterxml.jackson.databind.node.ArrayNode.class.cast(node), ops);
        }else {
            this.writeAndFlushValue(ops, this.createErrorResponse("2.0", "null", (-32600), "Invalid Request", null));
        }
    
}