@java.lang.Override
public void close() throws java.io.IOException {
    closeByteBufferImpl();
    synchronized(this) {
        org.apache.htrace.TraceScope scope = dfsClient.getPathTraceScope("DFSOutputStream#close", src);
        try {
            flushBuffer();
            completeFile(block);
        } finally {
            closed = true;
            scope.close();
        }
    }
    dfsClient.endFileLease(fileId);
    fileChannel.close();
    socketChannel.close();
    sChannel.close();
}