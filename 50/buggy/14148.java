private com.thoughtworks.go.plugin.api.response.GoPluginApiResponse handleValidation(com.thoughtworks.go.plugin.api.request.GoPluginApiRequest request) {
    java.util.HashMap validationResult = new java.util.HashMap();
    int responseCode = com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse.SUCCESS_RESPONSE_CODE;
    return createResponse(responseCode, validationResult);
}