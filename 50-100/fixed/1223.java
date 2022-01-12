public com.amazon.speech.speechlet.SpeechletResponse createNewNote(com.amazon.speech.speechlet.Session session) {
    quicknote.storage.QuickNote myNote = new quicknote.storage.QuickNote();
    session.setAttribute(quicknote.QuickNoteSpeechlet.NEW_NOTE_KEY, ((quicknote.storage.QuickNote) (myNote)));
    java.lang.String speechText = "What is the name of your new note?";
    java.lang.String repromptText = "Please tell me the name of your new note.";
    return getAskSpeechletResponse(speechText, repromptText);
}