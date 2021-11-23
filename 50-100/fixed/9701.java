@java.lang.Override
public void run() {
    udpServer.bind(new java.net.InetSocketAddress("127.0.0.1", com.navercorp.pinpoint.collector.receiver.udp.NettyUdpReceiverTest.PORT));
    try {
        logger.debug("server-await");
        latch.await();
    } catch (java.lang.InterruptedException ignored) {
    }
    logger.debug("server-shutdown");
}