@java.lang.Override
public void onClose(hu.berzsenyi.exchange.net.TCPServerClient client) {
    if ((this.listener) != null)
        this.listener.onClientDisconnected(client);
    
}