protected void suspend(bgu.spl.a2.Task<?> task) {
    if ((!(pool.isQueueEmpty(id))) && (!(java.lang.Thread.currentThread().isInterrupted()))) {
        bgu.spl.a2.Task t = pool.fetchTask(id);
        pool.submitToProcessor(id, task);
        t.start();
    }else {
        pool.submitToProcessor(id, task);
        steal();
    }
}