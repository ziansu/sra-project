private org.phenotips.remote.api.OutgoingMatchRequest generateErrorRequest(java.lang.Integer statusCode, java.lang.String errorMessage, org.phenotips.remote.hibernate.internal.DefaultOutgoingMatchRequest baseRequest) {
    baseRequest.setReplayHTTPStatus(statusCode);
    org.json.JSONObject errorJSON = new org.json.JSONObject();
    if (errorMessage == null) {
        errorJSON.put(ApiConfiguration.REPLY_JSON_ERROR_DESCRIPTION, errorMessage);
    }
    baseRequest.addRequestJSON(errorJSON);
    return baseRequest;
}