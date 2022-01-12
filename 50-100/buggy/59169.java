public static java.util.ArrayList<java.lang.String> convertJIDsToStringList(java.util.Collection<org.xmpp.packet.JID> jids) {
    java.util.ArrayList<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
    for (org.xmpp.packet.JID jid : jids) {
        result.add(jid.toBareJID());
    }
    return result;
}