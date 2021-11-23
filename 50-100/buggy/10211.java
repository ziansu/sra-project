@java.lang.Override
public void run() {
    try {
        int readCount = socketChannel.read(input);
        java.lang.System.out.println(("Read count: " + readCount));
        if (readCount > 0) {
            state = com.flyer.netty.reactor.third.ThirdHandler.PROCESSING;
            com.flyer.netty.reactor.third.ThirdHandler.pool.submit(new com.flyer.netty.reactor.third.ThirdHandler.Processor(readCount));
        }
        selectionKey.attach(new com.flyer.netty.reactor.third.ThirdHandler.Sender());
        selectionKey.interestOps(java.nio.channels.SelectionKey.OP_WRITE);
        selectionKey.selector().wakeup();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}