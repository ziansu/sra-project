private com.amazon.speech.speechlet.SpeechletResponse apaLagiMauResponse(com.amazon.speech.speechlet.Session session) {
    java.lang.String speechText = "what else can I do for you my friend?";
    java.lang.System.out.println(("TEMPPS: " + (session.getAttribute(com.tss.carkak.temperature.TemperatureSpeechlet.CATEGORY_STAGE))));
    session.removeAttribute(com.tss.carkak.temperature.TemperatureSpeechlet.CATEGORY_STAGE);
    java.lang.System.out.println(("TEMPPS22222: " + (session.getAttribute(com.tss.carkak.temperature.TemperatureSpeechlet.CATEGORY_STAGE))));
    return getAskSpeechletResponse(speechText);
}