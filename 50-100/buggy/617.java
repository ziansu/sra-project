public com.amazon.speech.ui.SsmlOutputSpeech call(java.lang.String subGroup, java.lang.String candidateFullname) {
    this.chosenSubGroup = subGroup;
    com.amazon.speech.ui.SsmlOutputSpeech text = new com.amazon.speech.ui.SsmlOutputSpeech();
    text.setSsml(SpeechHelper.wrapInSpeak("Text not set"));
    java.lang.String set = new java.lang.String("Text not set");
    try {
        set = textFromProfile(candidateFullname);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println(set);
    text.setSsml(set);
    return text;
}