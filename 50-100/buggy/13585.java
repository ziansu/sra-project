private void textInput() {
    if (!(inConversation)) {
        android.util.Log.d(TAG, " -- New conversation started");
        startNewConversation();
        addMessage(new com.example.it_systems.alexa_demo_1.TextMessage(userSpeech, "tx", getCurrentTimeStamp()));
        lexInteractionClient.textInForTextOut(userSpeech, null);
        inConversation = true;
    }else {
        android.util.Log.d(TAG, (" -- Responding with text: " + (userSpeech)));
        addMessage(new com.example.it_systems.alexa_demo_1.TextMessage(userSpeech, "tx", getCurrentTimeStamp()));
        convContinuation.continueWithTextInForTextOut(userSpeech);
    }
}