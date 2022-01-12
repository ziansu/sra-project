public com.chat.server.conversations.Conversation getConversationBetween(com.chat.server.clients.Client client1, com.chat.server.clients.Client client2) {
    synchronized(conversations) {
        for (com.chat.server.conversations.Conversation conversation : conversations) {
            if (!(conversation.isEmpty())) {
                if (conversation.containsExactly(client1, client2))
                    return conversation;
                
            }
        }
        com.chat.server.conversations.Conversation conversation = createConversation();
        conversation.addUser(client1);
        conversation.addUser(client2);
        return conversation;
    }
}