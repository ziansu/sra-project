@java.lang.Override
public com.amazon.speech.speechlet.SpeechletResponse onLaunch(final com.amazon.speech.speechlet.LaunchRequest request, final com.amazon.speech.speechlet.Session session) throws com.amazon.speech.speechlet.SpeechletException {
    quicknote.QuickNoteSpeechlet.log.info("onLaunch requestId={}, sessionId={}", request.getRequestId(), session.getSessionId());
    return getLaunchResponse(request, session);
}