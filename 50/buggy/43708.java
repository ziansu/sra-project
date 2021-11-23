private void chat() {
    java.lang.String conversation = myDisplay.chatInput("bzzzt...What yould you like to discuss at this time?");
    while (myBot.lengthChecker(conversation)) {
        conversation = myDisplay.chatInput(myBot.processConversation(conversation));
    } 
}