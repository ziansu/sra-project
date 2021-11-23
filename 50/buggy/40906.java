private void addNewMessage(java.lang.String answer) {
    org.fossasia.susi.ai.model.ChatMessage chatMessage = new org.fossasia.susi.ai.model.ChatMessage(answer, false, false);
    updateDatabase(answer, false, false);
    recyclerAdapter.addMessage(chatMessage, true);
}