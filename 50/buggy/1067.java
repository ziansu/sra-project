public com.fasterxml.jackson.databind.JsonNode getResponseBody() {
    body = response.getEntity(com.fasterxml.jackson.databind.JsonNode.class);
    return body;
}