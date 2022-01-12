@java.lang.Override
public void shutdown() {
    synchronized(lock) {
        if ((goAwayStatus) != null) {
            return ;
        }
        goAwayStatus = Status.UNAVAILABLE.withDescription("Transport stopped");
        listener.transportShutdown(goAwayStatus);
        stopIfNecessary();
        if ((keepAliveManager) != null) {
            keepAliveManager.onTransportShutdown();
            scheduler = io.grpc.internal.SharedResourceHolder.release(io.grpc.internal.GrpcUtil.TIMER_SERVICE, scheduler);
        }
    }
}