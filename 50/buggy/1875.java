public synchronized void addMessage(chat.server.Message message) {
    messages.add(message);
    notify();
}