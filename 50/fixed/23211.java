public java.lang.String fromUserToChatbot(java.lang.String conversation) {
    java.lang.String botResponse = "";
    if (chatBotClay.quitChecker(conversation)) {
        shutDown();
    }
    botResponse = chatBotClay.prossessConversation(conversation);
    return botResponse;
}