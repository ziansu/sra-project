private void getBotReaction() {
    if (((numAnnoyed) > 1) && ((numAnnoyed) < 4)) {
        chatbot.ChatbotMain.print(mild[((int) (java.lang.Math.floor(((java.lang.Math.random()) * 4))))]);
    }
    if ((numAnnoyed) <= 1) {
        chatbot.ChatbotMain.print(annoyed[((int) (java.lang.Math.floor(((java.lang.Math.random()) * 3))))]);
    }
}