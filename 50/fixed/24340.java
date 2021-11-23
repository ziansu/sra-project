java.lang.String getLink(com.fasterxml.jackson.databind.JsonNode linkNode) {
    if (linkNode.has(com.github.jasminb.jsonapi.HREF)) {
        return linkNode.get(com.github.jasminb.jsonapi.HREF).asText();
    }
    return linkNode.asText(null);
}