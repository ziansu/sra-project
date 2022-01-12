private com.google.gcloud.dns.testing.LocalDnsHelper.Response handleChangeCreate(com.sun.net.httpserver.HttpExchange exchange, java.lang.String projectId, java.lang.String zoneName, java.lang.String query) throws java.io.IOException {
    java.lang.String[] fields = com.google.gcloud.dns.testing.OptionParsers.parseGetOptions(query);
    java.lang.String requestBody = com.google.gcloud.dns.testing.LocalDnsHelper.decodeContent(exchange.getRequestHeaders(), exchange.getRequestBody());
    com.google.api.services.dns.model.Change change;
    try {
        change = com.google.gcloud.dns.testing.LocalDnsHelper.jsonFactory.fromString(requestBody, com.google.api.services.dns.model.Change.class);
    } catch (java.lang.IllegalArgumentException ex) {
        return com.google.gcloud.dns.testing.LocalDnsHelper.Error.REQUIRED.response("The 'entity.change' parameter is required but was missing.");
    }
    return createChange(projectId, zoneName, change, fields);
}