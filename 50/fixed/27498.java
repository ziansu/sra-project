@java.lang.Override
public void close() {
    this.isClosed = true;
    this.useBegin = false;
}