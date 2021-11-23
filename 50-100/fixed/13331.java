private org.jitsi.impl.protocol.xmpp.ChatMemberImpl addMember(java.lang.String participant) {
    org.jitsi.impl.protocol.xmpp.ChatMemberImpl newMember;
    if (members.containsKey(participant)) {
        org.jitsi.impl.protocol.xmpp.ChatRoomImpl.logger.error(((participant + " already in ") + (roomName)));
        return null;
    }
    if (!(participant.equals(myMucAddress))) {
        (participantNumber)++;
    }
    newMember = new org.jitsi.impl.protocol.xmpp.ChatMemberImpl(participant, this, participantNumber);
    members.put(participant, newMember);
    return newMember;
}