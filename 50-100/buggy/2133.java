@java.lang.Override
public void shutdown() {
    boolean normalClose;
    synchronized(lock) {
        normalClose = !(goAway);
    }
    if (normalClose) {
        frameWriter.goAway(0, ErrorCode.NO_ERROR, new byte[0]);
        onGoAway(java.lang.Integer.MAX_VALUE, Status.INTERNAL.withDescription("Transport stopped"));
    }
    stopIfNecessary();
}