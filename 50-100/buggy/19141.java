public void startTalking() {
    chatbotProject.ChatbotMain.print("Welcome to our chatbot! What is your name?");
    userName = chatbotProject.ChatbotMain.getInput();
    while (chatting) {
        chatbotProject.ChatbotMain.print("What do you want to talk about?");
        java.lang.String response = chatbotProject.ChatbotMain.getInput();
        if (ricky.isTriggered(response)) {
            chatting = false;
            ricky.startChatting();
        }else {
            chatbotProject.ChatbotMain.print("I'm sorry. I don't understand.");
        }
    } 
}