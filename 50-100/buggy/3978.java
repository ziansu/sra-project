@java.lang.Override
public void sessionClosed(org.apache.mina.core.session.IoSession session) throws java.lang.Exception {
    java.lang.System.out.println(("BroadcastListenHandler,sessionClosed, disconnectClientsOnReconnect=" + (disconnectClientsOnReconnect)));
    if (disconnectClientsOnReconnect) {
        java.util.Iterator<org.apache.mina.core.session.IoSession> clientsIterator = clients.iterator();
        while (clientsIterator.hasNext()) {
            clientsIterator.next().close(false);
        } 
    }
}