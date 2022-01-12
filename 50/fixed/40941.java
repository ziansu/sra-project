public chatbot.AgentResponse resetContext(long sessionId) {
    return sendQuery("", "reset", "", sessionId, true);
}