public static void addXmppClient(long personaId, br.com.soapboxrace.xmpp.XmppTalk xmppClient) {
    br.com.soapboxrace.xmpp.XmppSrv.xmppClients.putIfAbsent(personaId, xmppClient);
}