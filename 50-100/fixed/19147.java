private void drainFrom(java.util.concurrent.BlockingQueue<org.zeromq.ZMsg> in) {
    int lastIndex = -1;
    org.zeromq.ZMsg msg;
    while (((++lastIndex) < (buffer.length)) && ((msg = in.poll()) != null)) {
        buffer[lastIndex] = msg;
        lastValidIndex = lastIndex;
    } 
}