public int handleNode(com.fasterxml.jackson.databind.JsonNode node, java.io.OutputStream ops) throws java.io.IOException {
    if (node.isObject()) {
        return handleObject(com.fasterxml.jackson.databind.node.ObjectNode.class.cast(node), ops);
    }else
        if (node.isArray()) {
            return handleArray(com.fasterxml.jackson.databind.node.ArrayNode.class.cast(node), ops);
        }else {
            this.writeAndFlushValue(ops, this.createErrorResponse("2.0", "null", (-32600), "Invalid Request", null));
            return -32600;
        }
    
}