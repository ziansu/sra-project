public com.fasterxml.jackson.databind.JsonNode getNode(java.lang.String jsonPath) {
    try {
        com.jayway.jsonpath.JsonPath compiledPath = getCompiledJsonPath(jsonPath);
        rootContext.read(compiledPath);
        com.fasterxml.jackson.databind.JsonNode node = rootContext.read(compiledPath);
        if (node.isMissingNode()) {
            return null;
        }else {
            return node;
        }
    } catch (com.jayway.jsonpath.PathNotFoundException e) {
        return null;
    }
}