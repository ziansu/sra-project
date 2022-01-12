public int handle(java.io.InputStream ips, java.io.OutputStream ops) throws java.io.IOException {
    com.googlecode.jsonrpc4j.ReadContext ctx = com.googlecode.jsonrpc4j.ReadContext.getReadContext(ips, mapper);
    com.fasterxml.jackson.databind.JsonNode jsonNode = null;
    try {
        ctx.assertReadable();
        jsonNode = ctx.nextValue();
    } catch (com.fasterxml.jackson.core.JsonParseException e) {
        writeAndFlushValue(ops, createErrorResponse("jsonrpc", "null", (-32700), "Parse error", null));
        return -32700;
    }
    return handleNode(jsonNode, ops);
}