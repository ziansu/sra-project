public void addMessage(codeu.chat.common.Message message) {
    messages.add(message);
    if (isInitialized) {
        hasMessageModified = true;
    }
}