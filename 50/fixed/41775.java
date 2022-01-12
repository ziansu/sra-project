@java.lang.Override
public boolean isShutdown() {
    synchronized(lock) {
        return shutdown;
    }
}