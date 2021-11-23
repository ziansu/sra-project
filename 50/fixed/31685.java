@java.lang.Override
public void close() {
    closed = true;
    cache.closeWrite();
}