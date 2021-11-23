public void update() {
    synchronized(conversations) {
        for (com.chat.server.conversations.Conversation conversation : conversations) {
            if (conversation.isEmpty()) {
                conversations.remove(conversation);
                idGenerator.returnID(conversation.getID());
                com.chat.server.utils.Logger.log((("Conversation " + (conversation.getID())) + " is empty, deleting"));
            }
        }
    }
}