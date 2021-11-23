private com.amazon.speech.speechlet.SpeechletResponse getSetupResponse(com.amazon.speech.slu.Intent intent, com.amazon.speech.speechlet.Session session) {
    java.lang.String speechText;
    setTeamAttributes(session.getAttribute("TeamOneName"), intent, session);
    return getSpeechlet(gameSetup(session, intent));
}