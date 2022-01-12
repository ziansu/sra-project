@java.lang.Override
public synchronized void clientDidDisconnect(com.tc.net.ClientID client) {
    boolean isBroken = true;
    if (!isBroken) {
        com.tc.util.Assert.assertTrue(this.connectedClients.contains(client));
    }
    this.connectedClients.remove(client);
}