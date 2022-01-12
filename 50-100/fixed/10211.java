private void read() throws java.io.IOException {
    int readCount = socketChannel.read(input);
    java.lang.System.out.println(("Read count: " + readCount));
    if (readCount > 0) {
        state = com.flyer.netty.reactor.third.ThirdHandler.PROCESSING;
        com.flyer.netty.reactor.third.ThirdHandler.pool.submit(new com.flyer.netty.reactor.third.ThirdHandler.Processor(readCount));
    }
    selectionKey.interestOps(java.nio.channels.SelectionKey.OP_WRITE);
    selectionKey.selector().wakeup();
}