private void startIOThread() {
    try {
        socket = new java.net.DatagramSocket(new java.net.InetSocketAddress(bindingAddress, org.opendaylight.lispflowmapping.implementation.serializer.LispMessage.PORT_NUM));
        lispThread = new org.opendaylight.lispflowmapping.southbound.LispSouthboundPlugin.LispIoThread(socket, lispSouthboundService);
        lispThread.start();
        org.opendaylight.lispflowmapping.southbound.LispSouthboundPlugin.logger.info("LISP (RFC6830) Mapping Service Southbound Plugin is up!");
        if (listenOnXtrPort) {
            restartXtrThread();
        }
    } catch (java.net.SocketException e) {
        org.opendaylight.lispflowmapping.southbound.LispSouthboundPlugin.logger.error("couldn't start socket {}", e.getMessage());
    }
}