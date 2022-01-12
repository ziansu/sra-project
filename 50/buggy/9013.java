public synchronized io.grpc.ServerImpl shutdown() {
    if (shutdown) {
        return this;
    }
    transportServer.shutdown();
    shutdown = true;
    timeoutService.shutdown();
    return this;
}