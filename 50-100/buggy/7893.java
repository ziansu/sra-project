private com.google.gcloud.testing.LocalDnsHelper.Response handleProjectGet(com.sun.net.httpserver.HttpExchange exchange) {
    java.lang.String path = com.google.gcloud.testing.LocalDnsHelper.BASE_CONTEXT.relativize(exchange.getRequestURI()).getPath();
    java.lang.String[] tokens = path.split("/");
    java.lang.String projectId = tokens[1];
    java.lang.String query = com.google.gcloud.testing.LocalDnsHelper.BASE_CONTEXT.relativize(exchange.getRequestURI()).getQuery();
    java.lang.String[] fields = com.google.gcloud.testing.OptionParsersAndExtractors.parseGetOptions(query);
    return getProject(projectId, fields);
}