public void cleanAndDisconnectXmppConnection() {
    try {
        if (null != (xmppConnection)) {
            xmppConnection.close();
        }
    } catch (rocks.xmpp.core.XmppException ignore) {
    }
    chatRoom = null;
    xmppConnection = null;
    joinedAs = null;
}