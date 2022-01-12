protected java.lang.Object extractValue(com.fasterxml.jackson.databind.JsonNode valueNode, int type) {
    com.nhl.link.rest.parser.converter.JsonValueConverter converter = converterFactory.converter(type);
    try {
        return converter.value(valueNode);
    } catch (java.lang.Exception e) {
        throw new com.nhl.link.rest.LinkRestException(javax.ws.rs.core.Response.Status.BAD_REQUEST, (("Incorrectly formatted value: '" + (valueNode.asText())) + "'"));
    }
}