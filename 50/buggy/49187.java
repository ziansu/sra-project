@java.lang.Override
public void run() {
    try {
        TreeUpdate(this, root, aiGame, executor, queue, END_TIME);
    } catch (final java.lang.Throwable ex) {
        handler.uncaughtException(java.lang.Thread.currentThread(), ex);
    }
}