private service.agent.AgentResponse sendQuery(java.lang.String event, java.lang.String userInput, java.lang.String context, long sessionId, boolean resetContext) {
    java.lang.String url = buildQuery(event, userInput, context, sessionId, resetContext);
    com.google.gson.JsonObject jsonObject = sendQuery("Authorization", ("Bearer " + (clientAccessToken)), url).getAsJsonObject();
    service.agent.AgentResponse resp = null;
    if (jsonObject != null) {
        resp = service.agent.AgentResponseParser.fromJson(jsonObject);
    }
    return resp;
}