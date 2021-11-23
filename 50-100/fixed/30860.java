private void loadDummyHistory() {
    adapter = new com.onelio.myuacloud.Apps.Chat.ChatAdapter(this, new java.util.ArrayList<com.onelio.myuacloud.Apps.Chat.ChatMessage>());
    messagesContainer.setAdapter(adapter);
    if ((chatHistory) != null) {
        for (int i = 0; i < (chatHistory.size()); i++) {
            com.onelio.myuacloud.Apps.Chat.ChatMessage message = chatHistory.get(i);
            displayMessage(message);
        }
    }
}