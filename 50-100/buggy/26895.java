public void incomingChatMessage(TeamOrange.instantmessenger.models.AppMessage message) {
    java.lang.String thread = message.getThread();
    TeamOrange.instantmessenger.models.AppChatSession relevantChat = getChatOfThread(thread);
    if (relevantChat != null) {
        TeamOrange.instantmessenger.models.AppChatSessionMessage m = new TeamOrange.instantmessenger.models.AppChatSessionMessage(message.getBody(), message.isInbound());
        relevantChat.addMessage(m);
        java.lang.System.out.println(message.getBody());
    }
}