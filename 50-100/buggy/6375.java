@java.lang.Override
public void flush() throws java.io.IOException {
    if ((buffer.length) > 0) {
        com.ibm.streamsx.hdfs.AsyncBufferWriter.FlushRunnable runnable = new com.ibm.streamsx.hdfs.AsyncBufferWriter.FlushRunnable(buffer, true, position);
        exService.execute(runnable);
        try {
            if (!(isClosed))
                buffer = bufferQueue.take();
            
            position = 0;
        } catch (java.lang.InterruptedException e) {
            com.ibm.streamsx.hdfs.AsyncBufferWriter.LOGGER.log(LogLevel.ERROR, "Unable to retrieve buffer from buffer queue.", e);
        }
    }
}