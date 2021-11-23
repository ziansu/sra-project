@java.lang.Override
public java.lang.Void call() throws java.lang.Exception {
    try {
        org.apache.storm.drpc.DRPCInvocationsClient c = new org.apache.storm.drpc.DRPCInvocationsClient(conf, server, port);
        synchronized(_clients) {
            _clients.add(c);
        }
    } catch (java.lang.Exception e) {
        org.apache.storm.drpc.DRPCSpout.LOG.warn("Can't connect to some drpcserver when init drpcspout,please check your cluster.", e);
    }
    return null;
}