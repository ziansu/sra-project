public synchronized void start() {
    pool = java.util.concurrent.Executors.newFixedThreadPool(me.ferrybig.javacoding.graphical.decompiler.support.CFRTalker.MAX_TASKS, new java.util.concurrent.ThreadFactory() {
        @java.lang.Override
        public java.lang.Thread newThread(java.lang.Runnable r) {
            java.lang.Thread t = new java.lang.Thread(r);
            t.setPriority(((java.lang.Thread.NORM_PRIORITY) - 2));
            t.setDaemon(true);
            return t;
        }
    });
    stopping = false;
    newTask();
}