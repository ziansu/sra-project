@java.lang.Override
public io.grpc.internal.ServerImpl shutdownNow() {
    shutdown();
    java.util.Collection<io.grpc.internal.ServerTransport> transportsCopy;
    io.grpc.Status nowStatus = Status.UNAVAILABLE.withDescription("Server shutdownNow invoked");
    boolean savedServerShutdownCallbackInvoked;
    synchronized(lock) {
        if ((shutdownNowStatus) != null) {
            return this;
        }
        shutdownNowStatus = nowStatus;
        transportsCopy = new java.util.ArrayList<io.grpc.internal.ServerTransport>(transports);
        savedServerShutdownCallbackInvoked = serverShutdownCallbackInvoked;
    }
    if (savedServerShutdownCallbackInvoked) {
        for (io.grpc.internal.ServerTransport transport : transportsCopy) {
            transport.shutdownNow(nowStatus);
        }
    }
    return this;
}