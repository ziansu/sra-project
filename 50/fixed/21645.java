@java.lang.Override
public synchronized void close() throws java.io.IOException {
    super.close();
    boolean[] value = socketAudits.get(java.lang.System.identityHashCode(this));
    value[1] = true;
}