@java.lang.Override
public synchronized void close() throws java.io.IOException {
    if (!(isClosed)) {
        isClosed = true;
        bufferProvider.recycle(memory);
        super.close();
    }
}