private com.google.gcloud.dns.testing.LocalDnsHelper.Response handleZoneCreate(com.sun.net.httpserver.HttpExchange exchange, java.lang.String projectId, java.lang.String query) throws java.io.IOException {
    java.lang.String[] options = com.google.gcloud.dns.testing.OptionParsers.parseGetOptions(query);
    java.lang.String requestBody = com.google.gcloud.dns.testing.LocalDnsHelper.decodeContent(exchange.getRequestHeaders(), exchange.getRequestBody());
    com.google.api.services.dns.model.ManagedZone zone;
    try {
        zone = com.google.gcloud.dns.testing.LocalDnsHelper.jsonFactory.fromString(requestBody, com.google.api.services.dns.model.ManagedZone.class);
    } catch (java.lang.IllegalArgumentException ex) {
        return com.google.gcloud.dns.testing.LocalDnsHelper.Error.REQUIRED.response("The 'entity.managedZone' parameter is required but was missing.");
    }
    return createZone(projectId, zone, options);
}