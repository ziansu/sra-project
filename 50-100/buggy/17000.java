@java.lang.Override
public com.restfb.DebugTokenInfo debugToken(java.lang.String inputToken) {
    verifyParameterPresence("inputToken", inputToken);
    java.lang.String response = makeRequest("/debug_token", com.restfb.Parameter.with("input_token", inputToken));
    com.restfb.JsonObject json = com.restfb.Json.parse(response).asObject();
    com.restfb.JsonObject data = json.get("data").asObject();
    try {
        return getJsonMapper().toJavaObject(data.toString(), com.restfb.DebugTokenInfo.class);
    } catch (java.lang.Throwable t) {
        throw new com.restfb.FacebookResponseContentException("Unable to parse JSON from response.", t);
    }
}