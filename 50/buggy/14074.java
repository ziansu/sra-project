public void cleanAndDisconnectXmppConnection() {
    try {
        xmppConnection.close();
    } catch (rocks.xmpp.core.XmppException ignore) {
    }
    chatRoom = null;
    xmppConnection = null;
    joinedAs = null;
}