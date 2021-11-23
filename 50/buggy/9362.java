@java.lang.Override
public void close() {
    cache.closeRead();
    this.closed = true;
}