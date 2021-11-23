private org.apache.http.HttpResponse postMessage(java.lang.String message) throws java.io.IOException {
    java.util.Map<java.lang.String, java.lang.String> getParams = new java.util.HashMap<>();
    getParams.put("text", message);
    getParams.put("channel", slackChannelId);
    getParams.put("as_user", "true");
    org.apache.http.client.methods.HttpGet httpGet = new org.apache.http.client.methods.HttpGet(slackApiUri("chat.postMessage", getParams));
    org.apache.http.HttpResponse response = httpClient.execute(httpGet);
    return response;
}