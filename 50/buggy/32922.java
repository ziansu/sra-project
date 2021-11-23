@java.lang.Override
public void close() {
    if ((connectionPool) != null) {
        connectionPool.destroy();
    }
    connectionPool = null;
    container = null;
}