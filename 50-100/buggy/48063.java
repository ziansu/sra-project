@java.lang.Override
public java.lang.Thread newThread(@android.support.annotation.NonNull
java.lang.Runnable runnable) {
    final java.lang.Thread result = new java.lang.Thread(runnable, (((name) + "-thread-") + (threadNum))) {
        @java.lang.Override
        public void run() {
            android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_BACKGROUND);
            try {
                super.run();
            } catch (java.lang.Throwable t) {
                uncaughtThrowableStrategy.handle(t);
            }
        }
    };
    synchronized(this) {
        (threadNum)++;
    }
    return result;
}