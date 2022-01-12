public com.amazon.speech.speechlet.SpeechletResponse stop(java.util.ResourceBundle language) {
    com.amazon.speech.ui.SsmlOutputSpeech ssml = Const.generateSsml(language.getString(Const.STOP_RESPONSE));
    return com.amazon.speech.speechlet.SpeechletResponse.newTellResponse(ssml);
}