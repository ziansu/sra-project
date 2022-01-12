private com.amazon.speech.speechlet.SpeechletResponse toAlexa(com.canvoice.string output) {
    com.amazon.speech.ui.SimpleCard card = new com.amazon.speech.ui.SimpleCard();
    card.setTitle("CanVoice");
    card.setContent(output);
    com.amazon.speech.ui.PlainTextOutputSpeech speech = new com.amazon.speech.ui.PlainTextOutputSpeech();
    speech.setText(output);
    return com.amazon.speech.speechlet.SpeechletResponse.newTellResponse(speech, card);
}