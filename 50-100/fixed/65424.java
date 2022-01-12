@java.lang.Override
public int read() throws java.io.IOException {
    try {
        if (this.endReached) {
            return -1;
        }
        final java.lang.Integer value = queue.poll(org.restlet.engine.io.PipeStream.QUEUE_TIMEOUT, java.util.concurrent.TimeUnit.SECONDS);
        if (value == null) {
            throw new java.io.IOException("Timeout while reading from the queue-based input stream");
        }else {
            this.endReached = value == (-1);
            return value.intValue();
        }
    } catch (java.lang.InterruptedException ie) {
        throw new java.io.IOException("Interruption occurred while writing in the queue");
    }
}