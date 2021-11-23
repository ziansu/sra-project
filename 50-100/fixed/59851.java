private synchronized void initEventLoop() {
    if ((eventloop) != null) {
        return ;
    }
    eventloop = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new java.util.concurrent.ThreadFactory() {
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable, ("ringo-worker-" + (id)));
            thread.setDaemon(true);
            return thread;
        }
    });
}