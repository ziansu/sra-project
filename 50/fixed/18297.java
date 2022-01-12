public chatbot.AgentResponse sendEvent(java.lang.String event, long sessionId) {
    return sendQuery(event, "", "", sessionId, false);
}