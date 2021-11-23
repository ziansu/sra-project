@java.lang.Override
public void run() {
    while (running) {
        try {
            server.acceptClient();
        } catch (final java.net.SocketException ex) {
            if (!(ex.getMessage().matches("Socket (is )?closed"))) {
                com.gitlab.zachdeibert.jnet.NetworkErrors.networkError(ex, server);
            }
        } catch (final java.lang.Exception ex) {
            com.gitlab.zachdeibert.jnet.NetworkErrors.networkError(ex, server);
        }
    } 
}