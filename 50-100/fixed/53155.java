@java.lang.Override
public com.restfb.DebugTokenInfo debugToken(java.lang.String inputToken) {
    verifyParameterPresence("inputToken", inputToken);
    java.lang.String response = makeRequest("/debug_token", com.restfb.Parameter.with("input_token", inputToken));
    try {
        com.restfb.json.JsonObject json = new com.restfb.json.JsonObject(response);
        com.restfb.json.JsonObject data = json.getJsonObject("data");
        return getJsonMapper().toJavaObject(data.toString(), com.restfb.DebugTokenInfo.class);
    } catch (java.lang.Throwable t) {
        throw new com.restfb.FacebookResponseContentException("Unable to parse JSON from response.", t);
    }
}