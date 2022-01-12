protected final java.util.Map<java.lang.Integer, java.util.concurrent.CompletableFuture<? extends io.fd.vpp.jvpp.dto.JVppReply<?>>> getRequests() {
    synchronized(requests) {
        return requests;
    }
}