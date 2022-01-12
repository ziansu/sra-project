private com.insightly.InsightlyRequest buildLeadsQuery(java.util.Map<java.lang.String, java.lang.Object> options, com.insightly.InsightlyRequest request) {
    if (options == null) {
        return request;
    }
    if (hasNotNullValue(options, "includeConverted")) {
        java.lang.String includeConverted = ((java.lang.String) (options.get("includeConverted")));
        request.queryParam("includeConverted", includeConverted);
    }
    addEmailParameter(options, request);
    addTagParameter(options, request);
    addIDsParameter(options, request);
    return request;
}