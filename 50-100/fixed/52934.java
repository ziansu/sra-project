@java.lang.Override
public void onSessionStarted(com.amazon.speech.json.SpeechletRequestEnvelope<com.amazon.speech.speechlet.SessionStartedRequest> requestEnvelope) {
    chicagorecycle.RecycleSpeechlet.log.info("onSessionStarted requestId={}, sessionId={}", requestEnvelope.getRequest().getRequestId(), requestEnvelope.getSession().getSessionId());
    responseManager = new chicagorecycle.ResponseManager();
    recycleManager = new chicagorecycle.RecycleManager(responseManager);
}