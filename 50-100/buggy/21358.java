public eu.siacs.conversations.xmpp.stanzas.MessagePacket generateChat(eu.siacs.conversations.entities.Message message, boolean addDelay) {
    eu.siacs.conversations.xmpp.stanzas.MessagePacket packet = preparePacket(message, addDelay);
    if (message.hasFileOnRemoteHost()) {
        packet.setBody(message.getFileParams().url.toString());
    }else {
        packet.setBody(message.getBody());
    }
    return packet;
}