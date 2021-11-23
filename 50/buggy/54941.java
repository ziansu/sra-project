@java.lang.Override
public synchronized void shutdown() {
    live = false;
    shutdownSocketAcceptor();
    closeServerSocket();
    stop();
    connectionListeners.clear();
}