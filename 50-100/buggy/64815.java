public void repeated(java.lang.String response, int repetition) {
    if (repetition < 4) {
        chatbot.ChatbotMain.print(repeated[repetition]);
        ChatbotMain.chatbot.restartChat(chatbot.ChatbotMain.getInput());
    }else {
        chatbot.ChatbotMain.print((("Well it was nice talking to you " + (ChatbotMain.chatbot.getUsername())) + (favoriteStudent(favorite))));
        java.lang.System.exit(0);
    }
}