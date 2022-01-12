private org.jitsi.impl.protocol.xmpp.ChatMemberImpl addMember(java.lang.String participant) {
    if (members.containsKey(participant)) {
        org.jitsi.impl.protocol.xmpp.ChatRoomImpl.logger.error(((participant + " already in ") + (roomName)));
        return null;
    }
    org.jitsi.impl.protocol.xmpp.ChatMemberImpl newMember = new org.jitsi.impl.protocol.xmpp.ChatMemberImpl(participant, this);
    members.put(participant, newMember);
    return newMember;
}