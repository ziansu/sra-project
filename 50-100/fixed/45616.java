@java.lang.Override
public long check(final hudson.slaves.SlaveComputer c) {
    if (isIdleForTooLong(c)) {
        parent.terminateInstance(c.getName());
    }else {
        if (((c.isOffline()) && (!(c.isConnecting()))) && (c.isLaunchSupported()))
            c.tryReconnect();
        
    }
    return 1;
}