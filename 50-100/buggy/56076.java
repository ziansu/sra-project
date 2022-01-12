private void authorizationNeeded(javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    response.setContentType("application/json");
    com.fasterxml.jackson.databind.node.JsonNodeFactory factory = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance;
    com.fasterxml.jackson.databind.node.ObjectNode node = factory.objectNode();
    node.put("message", "No connection - authorization with linkedIn needed");
    response.getWriter().print(node.toString());
}