private speechlet.SpeechletResponse getWelcomeResponse() {
    java.lang.String speechText = "Welcome in Calculator Skill, made by science club HashCode" + "at Gdansk branch of Polish-Japanese Academy Of Technology in Warsaw.";
    com.amazon.speech.ui.SimpleCard card = new com.amazon.speech.ui.SimpleCard();
    card.setTitle("WelcomeResponse");
    card.setContent(speechText);
    com.amazon.speech.ui.PlainTextOutputSpeech speech = new com.amazon.speech.ui.PlainTextOutputSpeech();
    speech.setText(speechText);
    speechlet.SpeechletResponse response = new speechlet.SpeechletResponse();
    response.setCard(card);
    response.setOutputSpeech(speech);
    return response;
}