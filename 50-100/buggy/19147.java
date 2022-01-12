private void drainFrom(java.util.concurrent.BlockingQueue<org.zeromq.ZMsg> in) {
    int lastIndex = -1;
    org.zeromq.ZMsg msg;
    while ((msg = in.poll()) != null) {
        lastIndex++;
        if (lastIndex < (buffer.length)) {
            buffer[lastIndex] = msg;
        }else {
            break;
        }
    } 
    lastValidIndex = lastIndex;
}