@java.lang.Override
public void connect(java.net.SocketAddress endpoint, int timeout) throws java.io.IOException {
    log.info("Connecting socket {}", java.lang.System.identityHashCode(this));
    super.connect(endpoint, timeout);
    socketAudits.get(java.lang.System.identityHashCode(this))[0] = true;
}