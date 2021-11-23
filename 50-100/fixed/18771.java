public boolean checkRequest(org.jivesoftware.smack.packet.Stanza packet) {
    org.kontalk.client.GroupExtension group = org.kontalk.client.GroupExtension.from(packet);
    return ((group != null) && (group.getJID().equalsIgnoreCase(getJID()))) && (!((!(isOwned(packet.getFrom()))) && (((group.getType()) == (GroupExtension.Type.CREATE)) || ((group.getType()) == (GroupExtension.Type.SET)))));
}