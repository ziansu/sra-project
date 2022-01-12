@java.lang.Override
public void execute(java.lang.Runnable runnable) {
    synchronized(lock) {
        tasks.add(runnable);
        lock.notify();
    }
}