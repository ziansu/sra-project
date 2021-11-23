private synchronized void initOutgoingConn(int proc) throws java.io.IOException {
    if ((outSockets.get(proc)) != null)
        throw new java.lang.IllegalStateException((("proc " + proc) + " not null"));
    
    outSockets.put(proc, new com.cs380d.framework.OutgoingSock(new java.net.Socket(config.addresses.get(proc), config.ports.get(proc))));
    config.logger.info(java.lang.String.format("Server %d: Socket to %d established", config.procNum, proc));
}