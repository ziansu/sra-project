@java.lang.Override
public synchronized int read() throws java.io.IOException {
    int value = super.read();
    checkReadSoFarOrThrow((value >= 0 ? 1 : -1));
    return value;
}