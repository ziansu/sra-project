public synchronized void start() {
    pool = java.util.concurrent.Executors.newFixedThreadPool(me.ferrybig.javacoding.graphical.decompiler.support.CFRTalker.MAX_TASKS, (java.lang.Runnable r) -> {
        java.lang.Thread t = new java.lang.Thread(r);
        t.setPriority(((java.lang.Thread.NORM_PRIORITY) - 2));
        t.setDaemon(true);
        return t;
    });
    stopping = false;
    for (int i = 0; i < (me.ferrybig.javacoding.graphical.decompiler.support.CFRTalker.MAX_TASKS); i++) {
        newTask();
    }
}