public void processPacket(org.jivesoftware.smack.packet.Stanza packet) {
    org.jivesoftware.smack.packet.Message message = ((org.jivesoftware.smack.packet.Message) (packet));
    org.jivesoftware.smack.chat.Chat chat;
    if ((message.getThread()) == null) {
        chat = getUserChat(message.getFrom());
    }else {
        chat = getThreadChat(message.getThread());
    }
    if (chat == null) {
        chat = createChat(message);
    }
    if (chat == null)
        return ;
    
    deliverMessage(chat, message);
}