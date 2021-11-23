private java.lang.String readRequestBody(javax.servlet.http.HttpServletRequest request) {
    try {
        java.lang.StringBuilder buffer = new java.lang.StringBuilder();
        java.io.BufferedReader reader = request.getReader();
        java.lang.String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        } 
        return buffer.toString();
    } catch (java.lang.Exception e) {
        com.pkrete.xrd4j.tools.rest_gateway.ConsumerGateway.logger.error("Failed to read the request body from the request.");
    }
    return null;
}