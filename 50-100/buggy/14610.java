private void onSetPort(org.zeromq.api.Message message) {
    int port = message.popInt();
    reactor.build().cancel(beaconHandler);
    udp.close();
    try {
        udp = new org.zeromq.jzmq.UdpSocket(port);
    } catch (java.io.IOException ex) {
        java.lang.System.err.println("E: Unable to initialize DatagramChannel for UDP beacon");
        if (verbose) {
            ex.printStackTrace();
        }
    }
    reactor.withInPollable(udp.getChannel(), beaconHandler);
}