@java.lang.Override
public synchronized void close() throws java.io.IOException {
    super.close();
    socketAudits.get(java.lang.System.identityHashCode(this))[1] = true;
}