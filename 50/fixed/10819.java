@java.lang.Override
public synchronized void unregister(com.dreameddeath.infrastructure.daemon.AbstractDaemon daemon) throws java.lang.Exception {
    if ((_currDaemonNode) != null) {
        _currDaemonNode.close();
        _currDaemonNode = null;
    }
}