@java.lang.Override
public void onControlPingReply(final io.fd.vpp.jvpp.dto.ControlPingReply reply) {
    final io.fd.vpp.jvpp.callback.ControlPingCallback callback;
    synchronized(pingCalls) {
        callback = pingCalls.remove(reply.context);
    }
    if (callback == null) {
        io.fd.vpp.jvpp.JVppRegistryImpl.LOG.log(java.util.logging.Level.WARNING, ((("No callback was registered for reply context=" + (reply.context)) + " Contexts waiting=") + (pingCalls.keySet())));
        return ;
    }
    callback.onControlPingReply(reply);
}