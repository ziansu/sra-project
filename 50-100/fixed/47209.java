public void processPacket(org.jivesoftware.smack.packet.Stanza packet) {
    org.jivesoftware.smack.packet.Message message = ((org.jivesoftware.smack.packet.Message) (packet));
    org.jivesoftware.smack.chat.Chat chat = null;
    if ((message.getThread()) != null) {
        chat = getThreadChat(message.getThread());
    }
    if (chat == null) {
        chat = getUserChat(message.getFrom());
    }
    if (chat == null) {
        chat = createChat(message);
    }
    if (chat == null)
        return ;
    
    deliverMessage(chat, message);
}