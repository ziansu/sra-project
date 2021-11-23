@java.lang.Override
public long check(final hudson.slaves.SlaveComputer c) {
    if (isIdleForTooLong(c)) {
        c.disconnect(new hudson.slaves.OfflineCause.ChannelTermination(new java.lang.Exception()));
        parent.terminateInstance(c.getName());
    }else {
        if (((c.isOffline()) && (!(c.isConnecting()))) && (c.isLaunchSupported()))
            c.tryReconnect();
        
    }
    return 1;
}