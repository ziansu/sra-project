private org.jitsi.impl.protocol.xmpp.ChatMemberImpl addMember(java.lang.String participant) {
    org.jitsi.impl.protocol.xmpp.ChatMemberImpl newMember;
    synchronized(members) {
        if (members.containsKey(participant)) {
            org.jitsi.impl.protocol.xmpp.ChatRoomImpl.logger.error(((participant + " already in ") + (roomName)));
            return null;
        }
        newMember = new org.jitsi.impl.protocol.xmpp.ChatMemberImpl(participant, this);
        members.put(participant, newMember);
    }
    return newMember;
}