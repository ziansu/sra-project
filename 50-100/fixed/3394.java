@java.lang.Override
public void onFailure(int statusCode, java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers, java.lang.String content) {
    try {
        if ((content.length()) > 0) {
            java.lang.Error error = com.mb3364.twitch.api.resources.AbstractResource.objectMapper.readValue(content, java.lang.Error.class);
            apiHandler.onFailure(statusCode, error.getStatusText(), error.getMessage());
        }else {
            apiHandler.onFailure(statusCode, "", "");
        }
    } catch (java.lang.Exception e) {
        apiHandler.onFailure(e);
    }
}