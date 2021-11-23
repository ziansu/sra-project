public chatbot.AgentResponse sendUserInput(java.lang.String userInput, long sessionId) {
    return sendQuery("", userInput, sessionId, false);
}