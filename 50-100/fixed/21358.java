public eu.siacs.conversations.xmpp.stanzas.MessagePacket generateChat(eu.siacs.conversations.entities.Message message) {
    eu.siacs.conversations.xmpp.stanzas.MessagePacket packet = preparePacket(message);
    if (message.hasFileOnRemoteHost()) {
        packet.setBody(message.getFileParams().url.toString());
    }else {
        packet.setBody(message.getBody());
    }
    return packet;
}